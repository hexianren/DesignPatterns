package com.peter;

/**
 * 维护一个State子类的实例，这个实例定义当前的状态
 */
public class Person {

	private State state;  // 状态
	

	public void setState(State state) {
		this.state = state;
	}

	public void smile() {
		if (state != null) {
			state.smile();
		}
	}
	
	public void cry(){
		if (state != null) {
			state.cry();
		}
	}

	public void say(){
		if (state != null) {
			state.say();
		}
	}
}
