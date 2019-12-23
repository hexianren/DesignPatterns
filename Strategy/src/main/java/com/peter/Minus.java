package com.peter;

/**
 * 具体的策略实现 
 * 相减计算
 * @author Administrator
 *
 */
public class Minus implements ICalculator {  
	  
    @Override  
    public int calculate(int a, int b) {  
	    return a - b;
    }  
  
}  
