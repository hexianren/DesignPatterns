package com.peter;

/**
 * 装饰类
 * 从外类来扩展Component类的功能
 */
public class Decoartor implements Component {

	private Component component;
	
	public Decoartor(Component component){
		this.component = component;
	}
	
	@Override
	public void operation() {
		component.operation();
	}

}
