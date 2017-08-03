package com.peter;

public class MotoMible extends Mobile {

	public MotoMible(String brand) {
		super(brand);
	}

	@Override
	public void play() {
		System.out.println("Moto Mobile: ");
		this.getSoft().play();
	}
}
