package com.peter;

public class Test {
	public static void main(String[] args) {
		//创建发起人
		Originator originator = new Originator();
		//创建负责人
		Caretaker caretaker = new Caretaker();

		originator.setState("On");
		// Store internal state
		caretaker.saveMemento(originator.createMemento());

		// Continue changing originator
		originator.setState("Off");

		// Restore saved state
		originator.restoreMemento(caretaker.retrieveMemento());
		System.out.println("Last State " + originator.getState());
	}
}
