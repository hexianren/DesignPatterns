package com.peter;

/**
 * 交通工具的工厂类，用于生产一辆交通工具
 * 相当于Creator
 */
public abstract class VehicleFactory {
	abstract Moveable create();  // 具体怎样生产让子类去实现
}
