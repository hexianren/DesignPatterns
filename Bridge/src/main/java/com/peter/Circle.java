package com.peter;

public class Circle extends Shape {
	public Circle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.print("Circle: ");
		getColor().draw();
	}
}
