package com.peter;

/**
 * 代理模式（静态代理）的测试
 */
public class Test {
	public static void main(String[] args) {
		Subject sub = new ConcreteSubject();
		Subject proxy = new Proxy(sub);
		proxy.request();
	}
}
