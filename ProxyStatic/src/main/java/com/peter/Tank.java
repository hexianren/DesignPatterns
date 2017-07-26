package com.peter;

/**
 * 被代理类
 */
public class Tank implements Moveable{

	@Override
	public void move() {
		System.out.println("坦克正在开了...");
	}
}
