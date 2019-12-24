package com.peter;

/**
 * 模板方法的测试
 */
public class Test {
	public static void main(String[] args) {
		MakeVehicle v = new MakeBus();
		v.Make();

		v = new MakeCar();
		v.Make();
	}
}
