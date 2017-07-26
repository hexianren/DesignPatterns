package com.peter;

/**
 * 模板方法的测试
 * 实现 ：把具有特定步骤算法中的某些必要的处理委让给抽象方法，通过子类继承对抽象方法的不同实现改变整个算法的行为
 */
public class Test {

	public static void main(String[] args) {
		MakeVehicle v = new MakeBus();
		v.Make();
		System.out.println("***********");
		v = new MakeCar();
		v.Make();
	}
}
