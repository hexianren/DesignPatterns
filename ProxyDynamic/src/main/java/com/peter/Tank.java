package com.peter;

import java.util.Random;

/**
 * 被代理类(坦克)
 */
public class Tank implements Moveable {

	@Override
	public void move() {
		System.out.println("Tank Moving...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}	
}
