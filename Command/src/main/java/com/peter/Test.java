package com.peter;

/**
 * 命令模式的测试
 * 将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化
 * 要点：
	1、命令模式将发出请求的对象和执行请求的对象解耦
	2、在被解耦的两者之间是通过命令对象进行沟通的。命令对象封装了接收者和一个或一组动作
	3、调用者通过调用命令对象的execute()发出请求，这会使得接收者的动作被调用
 * @author Administrator
 * 2014/07/09
 */
public class Test {

	public static void main(String[] args) {
		Invoker zhangsan = new Invoker();
		System.out.println("------ 客户要求增加一项需求------");
        Command command = new AddRequirementCommand();
        zhangsan.setCommand(command);
        
        //这里可以测试一下
        zhangsan.runCommand();
	}
}
