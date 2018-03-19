package com.peter;

import java.util.Random;

/**
 * 被代理类(坦克)
 */
public class Tank implements Moveable {

	@Override
	public void move(final long distance) {
		System.out.println("Tank Moving...");
		try {
			Thread.sleep(new Random().nextInt(5000));
			System.out.println("Tank Moved " + distance + "KM");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
