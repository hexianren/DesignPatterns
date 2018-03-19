package com.peter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理模式的测试_4 (可以对任意的对象、任意的接口方法，实现任意的代理)
 * (目前只能实现一层代理，还没完成叠加的代理)
 * （在静态代理中，代理对象是要写出来的；而在动态代理中，不用知道代理对象的名字，要的那个代理对象直接帮你产生）
 */

public class Test {
	public static void main(String[] args) throws Exception {
		Tank t = new Tank();  // 被代理对象
		InvocationHandler h = new TimeHandler(t);  // 时间上的代理
		Moveable m = (Moveable) Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), h);
		m.move(10);
	}
}
