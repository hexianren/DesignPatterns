package com.peter;

public class Chrysanthemum implements Flower {
		public void accept(Visitor v) { v.visit(this);}
}
