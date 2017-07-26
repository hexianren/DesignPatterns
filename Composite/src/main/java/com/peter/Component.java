package com.peter;

public abstract class Component{
	String name;  
	  
    public abstract void add(Component c);  

    public abstract void remove(Component c);  

    public abstract void eachChild(); 
}
