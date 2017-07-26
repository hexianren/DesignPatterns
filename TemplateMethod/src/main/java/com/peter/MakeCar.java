package com.peter;

public class MakeCar extends MakeVehicle{

	// method1
	@Override
	public void makeHead() {
		System.out.println("Car:组装车头");
	}

	// method2
	@Override
	public void makeBody() {
		System.out.println("Car:组装车身");
	}

	// method3
	@Override
	public void makeFoot() {
		System.out.println("Car:组装车尾");
	}
}
