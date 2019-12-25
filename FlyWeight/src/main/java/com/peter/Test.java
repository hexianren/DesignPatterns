package com.peter;

/**
 * 享元模式的测试
 */
public class Test {
	public static void main(String[] args){   
		FlyweightFactory factory = new FlyweightFactory();   
		Flyweight fly1 = factory.getFlyWeight("obj1");  
		Flyweight fly2 = factory.getFlyWeight("obj2");  
		Flyweight fly3 = factory.getFlyWeight("obj1");    

		fly1.operation();  
		fly2.operation();  
		fly3.operation();   
		int objSize = factory.getFlyweightSize();  
		System.out.println("objSize = " + objSize);  
	}
}
