package com.peter;

public class GardenerVisitor implements Visitor {
		public void visit(Gladiolus g) {
				System.out.println("Gardener and Gladiolus");
		}
		
		public void visit(Runuculus r) {
				System.out.println("Gardener and Runuculus");
		}
					
		public void visit(Chrysanthemum c) {
				System.out.println("Gardener and Chrysanthemum");
		}
}
