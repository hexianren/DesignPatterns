package com.peter;

public class Test {
	public static void main(String[] args) {
		//创建发起人
		Originator o = new Originator();
		//创建负责人
		Caretaker c = new Caretaker();

		o.setState("On");
		// Store internal state
		c.saveMemento(o.createMemento());

		// Continue changing originator
		o.setState("Off");

		// Restore saved state
		o.restoreMemento(c.retrieveMemento());
	}
}
