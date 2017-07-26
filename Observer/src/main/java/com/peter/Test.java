package com.peter;

/**
 * 观察者模式的测试
 * 当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化
 */
public class Test {

	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		
		sub.operation();
	}
}
