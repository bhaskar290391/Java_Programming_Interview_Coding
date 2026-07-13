package com.practise.linkedin.set4;

class Shape {
	public void draw() {
		System.out.println("Shape is drawing");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle is drawing");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Rectangle is drawing");
	}
}

public class Program74_InheritanceRuntimePolyMorphism {
	public static void main(String[] args) {
		Shape s = new Shape();
		Shape c = new Circle();
		Shape r = new Rectangle();
		s.draw();
		c.draw();
		r.draw();
	}
}
