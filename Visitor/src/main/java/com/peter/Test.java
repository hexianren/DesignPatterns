package com.peter;

import java.util.*;

public class Test {
	/*
	   在这里你能看到访问者模式执行的流程:
	   首先在客户端先获得一个具体的访问者角色
	   遍历对象结构对每一个元素调用accept方法，将具体访问者角色传入
	   这样就完成了整个过程
	*/
	//对象结构角色在这里才组装上 
	public static void main(String args[]) { 
			List<Flower> flowers = new ArrayList<Flower>();
			Visitor sval, sval1;
			/*
			   It’s almost as if I had a function to
			   produce a Flower string representation:
			   这个地方你可以修改以便使用另外一个具体访问者角色
			*/
			
			for(int i = 0; i < 10; i++) {
					flowers.add(FlowerGenerator.newFlower());
			}
			
			sval = new BeeVisitor();
			sval1 = new GardenerVisitor();

			for (Flower flower : flowers) {
					flower.accept(sval);
					System.out.println(sval);
					flower.accept(sval1);
					System.out.println();
			}
	}
}
