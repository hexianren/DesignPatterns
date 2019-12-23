package com.peter;

/**
 * 静态工厂模式（普通工厂）的测试
 */
public class Test {
	public static void main(String[] args) {
		TransportFactory f = new RealFactory();
		Car car = f.create(Car.class);
		car.run();
	}
}
