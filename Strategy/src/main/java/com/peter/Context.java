package com.peter;

/**
 * @author Administrator
 *
 */
public class Context {  
	ICalculator cal = null;
	public Context(ICalculator cal) {
		this.cal = cal;
	}

	public int exec(int a, int b) {
		return cal.calculate(a, b);
	}
} 
