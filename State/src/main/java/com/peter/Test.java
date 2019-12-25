package com.peter;
public class Test {
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new ConcreteStateA());

		context.handle1();
		context.handle2();
	}
}
