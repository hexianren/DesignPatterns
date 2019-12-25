package com.peter;

public class Test {
	public static void main(String[] args) {
		Color red = new Red();
		Color blue = new Blue();

		Shape circle = new Circle(red);
		circle.draw();

		circle = new Circle(blue);
		circle.draw();

		Shape rect = new Rectangle(red);
		rect.draw();

		rect = new Rectangle(blue);
		circle.draw();
	}
}
