package com.peter;

/**
 * 主对象（被观察的对象）
 * 将有关状态存入具体观察者对象，当该对象改变时，给所有登记过的观察者发出通知
 */
public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}

}
