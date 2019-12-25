package com.peter;

public class ConcreteStateB extends State {
	@Override
	public void handle1() {
		context.setState(Context.STATE1);
		context.handle1();
	}

	@Override
	public void handle2() {
		System.out.println("State B handles");
	}
}
