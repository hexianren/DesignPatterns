package com.peter;

/**
 * 外观模式的测试
 * 外观模式就是将多个类的关系放在一个Facade类中，降低了类类之间的耦合度
 * @author Administrator
 * 2014/07/04
 */
public class Test {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
