package com.peter;

// The Flower hierarchy cannot be changed:
//元素角色
public interface Flower { 
	void accept(Visitor v);
}
