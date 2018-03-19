package com.peter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 时间处理器
 * （在被代理对象方法执行前后加上时间）
 */
public class TimeHandler implements InvocationHandler {
	
	private Object target;  // 目标对象（被代理对象）

	// 通过构造方法给处理器传入被代理对象
	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result;
		long start = System.currentTimeMillis();
		System.out.println("Start Time: " + start);
		result = method.invoke(target, args);  // 调用被代理对象的M方法
		long end = System.currentTimeMillis();
		System.out.println("Spent time: " + (end - start));
		return result;
	}
}