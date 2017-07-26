package com.peter;

/**
 * 具体聚集类
 * @author Administrator
 *
 */
public class ConcreteAggregate implements Aggregate {  
	  
    public String string[] = {"A","B","C","D","E"};  
    @Override  
    public Iterator CreateIterator() {  
        return new ConcreteIterator(this);  // 把数组传进
    }  
  
    @Override  
    public Object get(int i) {  
        return string[i];  
    }  
  
    @Override  
    public int size() {  
        return string.length;  
    }  
}
