package com.peter;

import java.util.*;

/**
 * 克隆自身的类
 */
public class Prototype implements Cloneable {
	private ArrayList<String> nameList;

	public Prototype(ArrayList<String> nameList) {
		this.nameList = nameList;
	}

	public List<String> getNameList() {
		return this.nameList;
	}
	
	public Object clone(){
		Prototype p = null;
		try {
			p = (Prototype)super.clone();
			p.nameList = (ArrayList<String>)this.nameList.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
