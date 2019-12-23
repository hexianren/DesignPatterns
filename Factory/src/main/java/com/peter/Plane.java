package com.peter;

/**
 * 相当于ConcreteProduct
 */
public class Plane implements Transport {
	
	@Override
	public void run() {
		System.out.println("开飞机...");
	}
}
