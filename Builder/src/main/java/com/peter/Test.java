package com.peter;

/**
 * 建造者模式的测试
 * @author Administrator
 * 2014/08/07
 */
public class Test {  
    public static void main(String[] args) {  
			Builder builderA = new ConcreteBuilderA();
			Director directorA = new Director(builderA);
			Product productA = directorA.build();
			System.out.println(productA.getPart1());
			System.out.println(productA.getPart2());

			Builder builderB = new ConcreteBuilderB();
			Director directorB = new Director(builderB);
			Product productB = directorB.build();
			System.out.println(productB.getPart1());
			System.out.println(productB.getPart2());
    }
}
