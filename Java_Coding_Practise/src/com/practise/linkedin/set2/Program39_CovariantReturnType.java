package com.practise.linkedin.set2;

class Shapes {

	Shapes draw() {
		System.out.println("Display Shape draw");
		return this;
	}
}

class Circle extends Shapes {
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	Circle draw() {
		System.out.println("Display Circle draw");
		return this;
	}
}

public class Program39_CovariantReturnType {
	public static void main(String[] args) {

		Shapes shape = new Shapes();
		shape.draw();

		Circle circle = new Circle(38);
		circle.draw();
	}
}
