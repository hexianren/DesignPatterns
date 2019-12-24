package com.peter;

import java.util.*;

/**
 * 原型模式
 * 将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
 */
public class Test {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add("Peter");
		nameList.add("Tom");
		Prototype pro = new Prototype(nameList);
		Prototype pro2 = (Prototype)pro.clone();
		System.out.println(pro.getNameList());
		System.out.println(pro2.getNameList());
	}
}
