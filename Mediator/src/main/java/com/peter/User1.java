package com.peter;

/**
 * 具体同事类
 * 每个具体同事只知道自己的行为，而不了解其他同事的情况，但都认识中介者对象
 */
public class User1 extends User {

	public User1(Mediator mediator){
		super(mediator);
	}
	
	@Override
	public void work() {
		System.out.println("user1 exe!");
	}
}
