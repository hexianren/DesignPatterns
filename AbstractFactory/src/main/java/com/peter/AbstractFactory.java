package com.peter;

/**
 * 抽象工厂
 * 包含所有产品创建的抽象方法
 * 可添加其他方法（生产其他品种）
 * @author Administrator
 *
 */
public abstract class AbstractFactory {
	public abstract Vehicle createVehicle();
	public abstract Food createFood();
}
