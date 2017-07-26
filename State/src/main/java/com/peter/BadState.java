package com.peter;

/**
 * 具体状态类，每一个子类实现一个与Person的一个状态相关的行为
 */
public class BadState extends State{

	@Override
	public void smile() {
		System.out.println("悲伤的笑...");
	}

	@Override
	public void cry() {
		System.out.println("悲伤的哭...");
	}

	@Override
	public void say() {
		System.out.println("悲伤的说...");
	}
}
