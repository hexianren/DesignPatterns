package com.peter;

public abstract class Mobile {

	private MobileSoft soft;
	private String name;

	public Mobile(String name) {
		this.name = name;
	}

	public MobileSoft getSoft() {
		return soft;
	}

	public void setSoft(MobileSoft soft) {
		this.soft = soft;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void play();
}
