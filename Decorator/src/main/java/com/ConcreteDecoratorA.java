package com.peter;

/**
 * 具体的装饰对象，给Component添加方法和属性的功能，通过Decorator的调度
 */
public class ConcreteDecoratorA extends Decoartor {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		System.out.println("A operation...");
		super.operation();
	}
}
