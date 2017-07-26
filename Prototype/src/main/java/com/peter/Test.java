package com.peter;

/**
 * 原型模式的测试
 * 将一个对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对象
 */
public class Test {
 
     public static void main(String[] args) {
         Prototype pro = new ConcretePrototype("prototype");
         Prototype pro2 = (Prototype)pro.clone();
         System.out.println(pro.getName());
         System.out.println(pro2.getName());
     }
}
