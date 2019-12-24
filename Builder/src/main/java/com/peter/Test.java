package com.peter;

/**
 * 建造者模式的测试
 * @author Administrator
 */
public class Test {  
    public static void main(String[] args) {  
		Builder builderA = new ConcreteBuilderA();
		Director directorA = new Director(builderA);
		Product productA = directorA.getProduct();
		System.out.println(productA.getPart1());
		System.out.println(productA.getPart2());

		Builder builderB = new ConcreteBuilderB();
		Director directorB = new Director(builderB);
		Product productB = directorB.getProduct();
		System.out.println(productB.getPart1());
		System.out.println(productB.getPart2());
    }
}
