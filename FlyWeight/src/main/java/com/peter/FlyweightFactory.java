package com.peter;

import java.util.Hashtable;

/**
 * 享元工厂
 * 创建并管理Flyweight对象，主要是用来确保合理地共享Flyweight，当用户请求一个Flyweight时，
 * FlyweightFactory提供一个已创建的实例或者创建一个（不存在的话）
 * @author Administrator
 *
 */
public class FlyweightFactory {

	private Hashtable flyweights = new Hashtable();  // 用来存储各个对象 
	
	public FlyweightFactory(){}  
	
	public Flyweight getFlyWeight(Object obj){  
		Flyweight flyweight = (Flyweight) flyweights.get(obj);  // 选出要实例化的对象 
		if(flyweight == null){
			// 产生新的ConcreteFlyweight  
			flyweight = new ConcreteFlyweight((String)obj);  
			flyweights.put(obj, flyweight);
		}  
		return flyweight;  // 将该对象返回，如果在Hashtable中没有要选择的对象，此时变量flyweight为null，产生一个新的flyweight存储在Hashtable中，并将该对象返回
	}  
	
	public int getFlyweightSize(){  
		return flyweights.size();  
	}
}
