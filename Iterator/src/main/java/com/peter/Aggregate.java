package com.peter;

/**
 * 聚集接口
 * @author Administrator
 *
 */
public interface Aggregate {  
    
    public Iterator CreateIterator();  
      
    /*取得集合元素*/  
    public Object get(int i);  
      
    /*取得集合大小*/  
    public int size();  
} 
