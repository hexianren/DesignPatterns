package com.peter;

/**
 * 具体的策略实现 
 * 相乘计算
 * @author Administrator
 *
 */
public class Multiply implements ICalculator {  
    @Override  
    public int calculate(int a, int b) {  
	    return a * b;
    }  
}
