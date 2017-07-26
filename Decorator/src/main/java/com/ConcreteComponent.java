package com.peter;

/**
 * 被装饰类
 * 具体的对象，可以动态的给这些对象添加属性和方法
 */
public class ConcreteComponent implements Component {
	@Override
	public void operation() {
		System.out.println("operation...");
	}
}
