package com.peter;

/**
 * 迭代器模式的测试
 * 实现 ：遍历集合
 * @author Administrator
 * 2014/07/31
 */
public class Test {  
	  
    public static void main(String[] args) {  
        Aggregate aggregate = new ConcreteAggregate();  
        Iterator it = aggregate.CreateIterator();  
          
        while(it.hasNext()){  
            System.out.println(it.next());  
        }  
    }  
}
