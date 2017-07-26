package com.peter;

/**
 * 相当于ConcreteProduct
 */
public class Car implements Moveable{
	
	public Car(){}

	@Override
	public void run(){
		System.out.println("开车...");
	}
}
