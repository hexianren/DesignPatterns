package com.peter;
public class ConcreteBuilderB implements Builder {
	private Product product = new Product();
	public void buildPart1() {
		product.setPart1("B buildPart1");
	}

	public void buildPart2() {
		product.setPart2("B buildPart2");
	}

	public Product build() {
		return product;
	}
}
