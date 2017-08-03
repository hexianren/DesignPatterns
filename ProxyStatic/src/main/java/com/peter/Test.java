package com.peter;

/**
 * 代理模式（静态代理）的测试
 */
public class Test {

	public static void main(String[] args) {
		Moveable m = new Tank();
		TankTimeProxy tp = new TankTimeProxy(m);
		TankPersonProxy pp = new TankPersonProxy(tp);
		tp.move();
	}
}
