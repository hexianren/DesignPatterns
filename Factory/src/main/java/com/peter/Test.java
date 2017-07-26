package com.peter;

/**
 * 静态工厂模式（普通工厂）的测试
 * 实现 ：任意定制交通工具类型和生产过程
 */
public class Test {

	public static void main(String[] args) {
		Moveable moveable = new CarFactory().create();  // 用汽车工厂创建一交通工具(单例)
		moveable.run();
		
		Moveable moveable2 = new PlaneFactory().create();  // 用飞机工厂创建一交通工具(单例)
		moveable2.run();
	}
}
