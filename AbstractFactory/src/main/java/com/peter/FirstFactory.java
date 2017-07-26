package com.peter;

/**
 * 第一个具体工厂
 * 相当于ConcreteFactory1
 * 生产“车”和“苹果”
 * @author Administrator
 *
 */
public class FirstFactory extends AbstractFactory{

	@Override
	public Vehicle createVehicle() {
		return new Car();
	}

	@Override
	public Food createFood() {
		return new Apple();
	}
}
