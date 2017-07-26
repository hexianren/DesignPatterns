package com.peter;

import java.lang.reflect.Method;

/**
 * 处理器接口
 */
public interface InvocationHandler {
	
	/**
	 * 
	 * @param o  代理对象
	 * @param m  
	 */
	public void invoke(Object o, Method m);
}
