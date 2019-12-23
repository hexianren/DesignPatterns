package com.peter;

/**
 * 交通工具的工厂类，用于生产一辆交通工具
 * 相当于Creator
 */
public class RealFactory extends TransportFactory {
	public <T extends Transport> T create(Class<T> c) {
		Transport transport = null;
		try {
			transport = (Transport) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
		}
		return (T)transport;
	}
}
