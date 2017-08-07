package com.peter;

//发起人 需要保存当前状态的类，通过createMemento生成当前状态的备忘录
public class Originator {
	private String state;

	public Memento createMemento(){
		return new Memento(state);
	}

	public void restoreMemento(Memento memento){
		this.state = memento.getState();
	}

	public String getState(){
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("Current state = " + this.state);
	}
}
