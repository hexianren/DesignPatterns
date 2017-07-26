package com.hin.singleton;

/**
 * 单例模式的测试
 * @author Administrator
 * 2014/07/04
 */
public class Test {

	public static void main(String[] args) {
		Car car = Car.getInstance();  // 用静态工厂创建一辆车(单例)
		Car car2 = Car.getInstance();
		
		// 测试是不是同一个实例
		if (car==car2) {
			System.out.println("车是一样的");
		}else {
			System.out.println("车是不一样的");
		}
		
	}
}
