package com.peter;

/**
 * 解释器模式的测试
 * 给定一个语言之后，解释器模式可以定义出其文法的一种表示，并同时提供一个解释器。客户端可以使用这个解释器来解释这个语言中的句子
 * @author Administrator
 */
public class Test {  
	  
    public static void main(String[] args) {  
  
        // 计算9+2-8的值  
        int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));  
        System.out.println(result);  
    }  
} 
