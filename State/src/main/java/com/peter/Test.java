package com.peter;
public class Test {
	public static void main(String[] args) {
		Context context = new Context();
		context.setLiftState(new ClosingState());
		context.open();
		context.open();
		context.open();
		context.run();
		context.close();
		context.run();
		context.stop();
	}
}
