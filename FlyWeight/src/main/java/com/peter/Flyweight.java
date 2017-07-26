package com.peter;

/**
 * 所有具体享元类的超类
 * 通过这个超类，Flyweight可以接受并作用于外部状态
 * @author Administrator
 *
 */
public abstract class Flyweight {
	
	public abstract void operation();
}
