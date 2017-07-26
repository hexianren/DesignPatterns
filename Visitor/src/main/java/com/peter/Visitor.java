package com.peter;

//访问者角色
public interface Visitor {
		void visit(Gladiolus g);
		void visit(Runuculus r);
		void visit(Chrysanthemum c);
}
