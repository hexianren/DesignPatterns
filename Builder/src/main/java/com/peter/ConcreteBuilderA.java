package com.peter;
public class ConcreteBuilderA implements Builder {
		private Product product = new Product();
		public void buildPart1() {
				product.setPart1("A buildPart1");
		}

		public void buildPart2() {
				product.setPart2("A buildPart2");
		}
		
		public Product getResult() {
				return product;
		}
}
