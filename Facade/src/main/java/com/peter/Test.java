package com.peter;

/**
 * ���ģʽ�Ĳ���
 * ���ģʽ���ǽ������Ĺ�ϵ����һ��Facade���У�����������֮�����϶�
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
