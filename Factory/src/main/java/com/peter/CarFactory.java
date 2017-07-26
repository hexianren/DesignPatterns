package com.peter;

/**
 * 汽车工厂类，用于生产汽车
 * 相当于ConcreteCreator
 */
public class CarFactory extends VehicleFactory{

	@Override
	Moveable create() {
		return new Car();
	}
}
