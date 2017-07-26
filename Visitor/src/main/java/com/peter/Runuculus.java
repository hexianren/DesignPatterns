package com.peter;

public class Runuculus implements Flower {
		public void accept(Visitor v) { v.visit(this);}
}
