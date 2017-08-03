package com.peter;

/**
 * 备忘录类
 * 负责存储Original对象的内部状态，并可防止Original以外的对象访问备忘录Memento
 */
public class Memento {  

	private String value;  

	public Memento(String value) {  
		this.value = value;  
	}  

	public String getValue() {  
		return value;  
	}  

	public void setValue(String value) {  
		this.value = value;  
	}  
}
