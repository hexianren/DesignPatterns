package com.peter;

/**
 * 具体中介者对象
 * 它需要知道所有具体同事类，并从具体同事接受消息，向具体同事发出命令
 */
public class MyMediator implements Mediator {

	private User user1;
	private User user2;
	
	public User getUser1() {
		return user1;
	}

	public User getUser2() {
		return user2;
	}

	@Override
	public void createMediator() {
		user1 = new User1(this);
		user2 = new User2(this);
	}

	@Override
	public void workAll() {
		user1.work();
		user2.work();
	}
}
