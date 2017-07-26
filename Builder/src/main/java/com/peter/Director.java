package com.peter;
public class Director {
		private Builder mBuilder;
		public Director(Builder builder) {
				mBuilder = builder;
		}

		public Product build() {
				mBuilder.buildPart1();
				mBuilder.buildPart2();
				return mBuilder.getResult();
		}
}
