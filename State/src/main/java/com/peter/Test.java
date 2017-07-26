package com.peter;

/**
 * 状态模式的测试
 * 根据不同的状态执行不同的动作
 */
public class Test {

	public static void main(String[] args) {
		Person p = new Person();
		p.smile();
		p.say();
		p.cry();
	}
}
