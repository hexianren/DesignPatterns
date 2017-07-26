package com.peter;

/**
 * 继承Flyweight超类，并为内部状态增加存储空间
 * @author Administrator
 *
 */
public class ConcreteFlyweight extends Flyweight {
	
	private String string;  
	public ConcreteFlyweight(String str){  
		string = str;  
	}

	@Override
	public void operation() {
		System.out.println("ConcreteFlyweight : " + string);
	}
}
