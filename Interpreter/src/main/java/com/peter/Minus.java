package com.peter;

/**
 * 终结符表达式(Terminal Expression)角色
 * @author Administrator
 */

public class Minus implements Expression {  
    @Override  
    public int interpret(Context context) {  
        return context.getNum1() - context.getNum2();  
    }  
} 
