package com.peter;

//负责人 相当于磁盘，用于存储Bean，确保发起人销毁后状态得以保存
public class Caretaker {
	private Memento memento;

	public Memento retrieveMemento() {
		return this.memento;
	}

	public void saveMemento(Memento memento) {
		this.memento = memento;
	}
}
