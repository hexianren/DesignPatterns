package com.peter;

/**
 * 策略模式的测试
 * 根据不同的策略执行不同的动作
 * @author Administrator
 */

public class Test {  
    public static void main(String[] args) {  
	Context context = new Context(new Plus());
        System.out.println("Result " + context.exec(1,2));
    }  
}
