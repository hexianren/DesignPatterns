package com.peter;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 把所有对象观察者对象的引用保存在一个集合中，可以增加或删除观察者对象
 */
public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vector = new Vector<Observer>();
	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Enumeration<Observer> enumo = vector.elements();
		while(enumo.hasMoreElements()){
			enumo.nextElement().update();
		}
	}
}
