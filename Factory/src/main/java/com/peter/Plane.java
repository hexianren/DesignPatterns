package com.peter;

/**
 * 相当于ConcreteProduct
 */
public class Plane implements Moveable{
	
	public Plane(){};

	@Override
	public void run() {
		System.out.println("开飞机...");
	}
}
