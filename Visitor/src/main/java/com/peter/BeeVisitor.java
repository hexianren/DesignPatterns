package com.peter;

public class BeeVisitor implements Visitor {
		private String s;

		public void visit(Gladiolus g) {
				s = "Bee and Gladiolus";
		}
		
		public void visit(Runuculus r) {
				s = "Bee and Runuculus";
		}
					
		public void visit(Chrysanthemum c) {
				s = "Bee and Chrysanthemum";
		}

		public String toString() { return s; }
}
