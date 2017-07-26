package com.peter;

/**
 * 飞机工厂类，用于生产飞机
 * 相当于ConcreteCreator
 */
public class PlaneFactory extends VehicleFactory{

	@Override
	Moveable create() {
		return new Plane();
	}
}
