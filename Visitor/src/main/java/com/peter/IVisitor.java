package com.peter;

//访问者角色
public interface IVisitor {
		public void visit(CommonEmployee commonEmployee);
		public void visit(Manager manager);
}
