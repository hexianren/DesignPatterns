package com.peter;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

/**
 * 动态生成代理对象的类（传入接口和处理器）
 * (能生成任意接口的代理对象，实现任意的代理)
 */
public class Proxy {
	public static Object newProxyInstance(Class infce, InvocationHandler h) throws Exception{
		String methodStr = "";
		String rt = "\r\n";
		
		Method[] methods = infce.getMethods();
		for(Method m : methods){  // 编历接口里面的方法
			methodStr += "    @Override" + rt +
					 	 "    public void " + m.getName() + "() {" + rt +
						 "    	  try {" + rt +
						 "    		Method md = " + infce.getName() + ".class.getMethod(\"" + m.getName() + "\");" + rt +
						 "    		h.invoke(this, md);" + rt +
						 "    	  }catch(Exception e) {e.printStackTrace();}" + rt +
						 "    }" + rt +
						 "}";			
		}
		
		String src = 
			"package com.hin.proxy_4;" +  rt +
			"import java.lang.reflect.Method;" + rt +
			"public class $proxy1 implements " + infce.getName() + " {" + rt +
			"    public $proxy1(InvocationHandler h) {" + rt +
			"        this.h = h;" + rt +
			"    }" + rt +
			
			"    com.hin.proxy_4.InvocationHandler h;" + rt +
			
			methodStr;  // 加上接口里的方法

		String fileName = System.getProperty("user.dir") 
							+ "/src/com/hin/proxy_4/$proxy1.java";
		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		
		//compile
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileName);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		t.call();
		fileMgr.close();
		
		//load into memory and create an instance
		URL[] urls = new URL[] {new URL("file:/" + System.getProperty("user.dir") +"/src")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.hin.proxy_4.$proxy1");
		System.out.println(c);
		
		Constructor ctr = c.getConstructor(InvocationHandler.class);  // 获得参数为Moveable的构造方法
		Object m = ctr.newInstance(h);
		//m.move();

		return m;
	}
}
