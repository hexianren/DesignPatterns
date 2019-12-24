package com.peter;

/**
 * 适配器类是本模式的核心；适配器把源接口转换成目标接口
 * @author Administrator
 *
 */
public class Adapter implements Target{
	private Adaptee adaptee = new Adaptee();

	@Override
	public void method() {
		System.out.println("this is the targetable method!");  

		adaptee.methodOriginal();
	}
}
