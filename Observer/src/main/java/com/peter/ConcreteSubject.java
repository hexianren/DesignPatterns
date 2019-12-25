package com.peter;

public class ConcreteSubject extends Subject {
	public void doSomething() {
		System.out.println("被观察对象改变，通知全部观察者");
		super.notifyObservers();
	}
}
