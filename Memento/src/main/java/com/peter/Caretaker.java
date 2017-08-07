package com.peter;

//负责人 用于存储备忘录，确保发起人销毁后备忘录得以保存
public class Caretaker {
	private Memento memento;

	public Memento retrieveMemento() {
		return this.memento;
	}

	public void saveMemento(Memento memento) {
		this.memento = memento;
	}
}
