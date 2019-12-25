package com.peter;
public class Proxy implements Subject {
	private Subject subject = null;
	public Proxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		before();
		subject.request();
		after();
	}

	private void before() {
		System.out.println("Before");
	}

	private void after() {
		System.out.println("after");
	}
}
