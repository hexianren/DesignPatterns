package com.peter;

public class ConcreteStateA extends State {
	@Override
	public void handle1() {
		System.out.println("State A handle1");
	}

	@Override
	public void handle2() {
		context.setState(Context.STATE2);
		context.handle2();
	}
}
