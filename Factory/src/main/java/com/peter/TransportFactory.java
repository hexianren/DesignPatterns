package com.peter;

/**
 * 交通工具的工厂类，用于生产一辆交通工具
 * 相当于Creator
 */
public abstract class TransportFactory {
	public abstract <T extends Transport> T create(Class<T> c);  // 具体怎样生产让子类去实现
}
