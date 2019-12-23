package com.peter;

/**
 * 克隆自身的类
 */
public class Prototype implements Cloneable {
 
     private String name;

     public Prototype(String name) {
         this.name = name;
     }
     
     public String getName() {
         return this.name;
     }
 
     public Object clone(){
         try {
             return super.clone();
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }
     }
}
