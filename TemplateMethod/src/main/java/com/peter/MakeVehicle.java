package com.peter;

public abstract class MakeVehicle {
	public abstract void makeHead();//method1
	public abstract void makeBody();//method2
	public abstract void makeFoot();//method3

	/**
	 * 模板方法
	 */
	public void Make() {
		this.makeHead();
		this.makeBody();
		this.makeFoot();
	}
}
