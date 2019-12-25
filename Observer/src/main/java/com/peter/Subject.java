package com.peter;

import java.util.*;

public abstract class Subject {
	private List<Observer> obsList = new LinkedList<>();

	public void addObserver(Observer o) {
		obsList.add(o);
	}

	public void delObserver(Observer o) {
		obsList.remove(o);
	}

	public void notifyObservers() {
		for (Observer o : obsList) {
			o.update();
		}
	}
}
