package com.peter;

import java.util.*;

public class Test {
	/*
	   在这里你能看到访问者模式执行的流程:
	   首先在客户端先获得一个具体的访问者角色
	   遍历对象结构对每一个元素调用accept方法，将具体访问者角色传入
	   这样就完成了整个过程
	*/
	//对象结构角色在这里才组装上 
	public static void main(String args[]) {
		for (Employee e : mockEmployee()) {
		    e.accept(new Visitor());
		}
	}

	public static List<Employee> mockEmployee() {
		List<Employee> employeeList = new ArrayList<>();
	    CommonEmployee zhangSan = new CommonEmployee();
	    zhangSan.setJob("Java程序");
	    zhangSan.setName("张三");
	    zhangSan.setSalary(1800);
	    zhangSan.setSex(Employee.MALE);
	    employeeList.add(zhangSan);

		CommonEmployee liSi = new CommonEmployee();
		liSi.setJob("美工");
		liSi.setName("李四");
		liSi.setSalary(1900);
		liSi.setSex(Employee.FEMALE);
		employeeList.add(liSi);

		Manager wangwu = new Manager();
		wangwu.setPerformance("管理");
		wangwu.setName("王五");
		wangwu.setSalary(2000);
		wangwu.setSex(Employee.MALE);
		employeeList.add(wangwu);
		return employeeList;
	}
}
