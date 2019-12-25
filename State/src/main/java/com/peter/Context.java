package com.peter;

public class Context {
	public final static State STATE1 = new ConcreteStateA();
	public final static State STATE2 = new ConcreteStateB();

	private State currentState;

	public State getState() {
		return currentState;
	}

	public void setState(State currentState) {
		this.currentState = currentState;
		this.currentState.setContext(this);
	}

	public void handle1() {
		this.currentState.handle1();
	}

	public void handle2() {
		this.currentState.handle2();
	}
}
