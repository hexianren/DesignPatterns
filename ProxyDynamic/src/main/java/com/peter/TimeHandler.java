package com.peter;

import java.lang.reflect.Method;

/**
 * 时间处理器
 * （在被代理对象方法执行前后加上时间）
 */
public class TimeHandler implements InvocationHandler{
	
	private Object target;  // 目标对象（被代理对象）

	// 通过构造方法给处理器传入被代理对象
	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public void invoke(Object o, Method m) {
		long start = System.currentTimeMillis();
		System.out.println("starttime:" + start);
		System.out.println(o.getClass().getName());
		try {
			m.invoke(target);  // 调用被代理对象的M方法
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end-start));
	}
}
