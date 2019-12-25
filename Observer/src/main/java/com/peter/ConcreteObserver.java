package com.peter;

public class ConcreteObserver implements Observer {
	@Override
	public void update() {
		System.out.println("接受到消息，并进行处理");
	}
}
