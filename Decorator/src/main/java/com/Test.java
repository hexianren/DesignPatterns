package com.peter;

/**
 * 装饰模式的测试
 * 装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
 * 
 * 装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问；
 * 用代理模式，代理类（proxy class）可以对它的客户隐藏一个对象的具体信息，因此，当使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例；
 * 使用装饰器模式的时候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器
 */
public class Test {

	public static void main(String[] args) {
		Component c = new ConcreteComponent();
		Component concreteDecoratorA = new ConcreteDecoratorA(c);
		concreteDecoratorA.operation();
	}
}
