package com.practise.linkedin.set6;

class Shape {

}

class Circle extends Shape {

	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

}

class Rectangle extends Shape {
	double length;
	double breadth;

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

}

public class Program108_InstanceOfPatternMatching {
	public static void main(String[] args) {

		Shape shape = new Circle(13.6);

		if (shape instanceof Circle circle) {
			System.out.println("The circle radius " + circle.radius);
		}else if(shape instanceof Rectangle rect) {
			System.out.println("The Length "+ rect.length+ " The breadth "+ rect.breadth);
			
		}else {
			System.out.println("Unknown Shape");
		}
	}
}
