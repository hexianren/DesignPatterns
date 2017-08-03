package com.peter;

public class NokiaMobile extends Mobile {

	public NokiaMobile(String brand) {
		super(brand);
	}

	@Override
	public void play() {
		System.out.print("Nokia Mobile: ");
		this.getSoft().play();
	}
}
