package com.peter;

import java.util.*;

/**
 * 享元工厂
 * @author Administrator
 *
 */
public class FlyweightFactory {

	private Map<String, Flyweight> pool = new HashMap<>();
	
	public FlyweightFactory(){}  
	
	public Flyweight getFlyWeight(String key){
		Flyweight flyweight = (Flyweight) pool.get(key);
		if (pool.containsKey(key)) {
			flyweight = pool.get(key);
		} else {
			flyweight = new ConcreteFlyweight(key);  
			pool.put(key, flyweight);
		}  
		return flyweight;
	}  
	
	public int getFlyweightSize(){  
		return pool.size();  
	}
}
