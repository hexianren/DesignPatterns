package com.peter;

/**
 * 装饰模式的测试
 */
public class Test {

	public static void main(String[] args) {
		Component c = new ConcreteComponent();
		Component concreteDecorator = new ConcreteDecorator(c);
		concreteDecorator.operation();
	}
}
