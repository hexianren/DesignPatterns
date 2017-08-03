package com.peter;

/**
 * 单例模式的测试
 */
public class Test {

	public static void main(String[] args) {
		Car car = Car.getInstance();
		Car car2 = Car.getInstance();
		Ship ship = Ship.getInstance();
		Ship ship2 = Ship.getInstance();

		// 测试是不是同一个实例
		if (car == car2) {
			System.out.println("车是同一辆");
		} else {
			System.out.println("车不是同一辆");
		}

		if (ship == ship2) {
			System.out.println("轮船是同一艘");
		} else {
			System.out.println("轮船不是同一艘");
		}
	}
}
