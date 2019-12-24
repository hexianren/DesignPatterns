package com.peter;

public class Adapter extends Adaptee implements Target{
	private Adaptee adaptee = new Adaptee();

	@Override
	public void method() {
		System.out.println("this is the targetable method!");  

		methodOriginal();
	}
}
