package com.peter;

/**
 * 具体的策略实现 
 * 相加计算
 * @author Administrator
 *
 */
public class Plus implements ICalculator {  
	  
    @Override  
    public int calculate(int a, int b) {  
	    return a + b;
    }  
} 
