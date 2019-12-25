package com.peter;

/**
 * 继承Flyweight超类，并为内部状态增加存储空间
 * @author Administrator
 *
 */
public class ConcreteFlyweight extends Flyweight {
	private String key;  
	public ConcreteFlyweight(String key){  
		this.key = key;
	}

	@Override
	public void operation() {
		System.out.println("ConcreteFlyweight : " + key);
	}
}
