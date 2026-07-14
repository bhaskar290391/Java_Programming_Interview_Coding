package com.practise.linkedin.set2;

abstract class Shape {
	abstract public void draw();

	public void display() {
		System.out.println("Displaying a shape");
	}
}

class Triangle extends Shape {

	@Override
	public void draw() {

		System.out.println("Triangle is drawing !!!");

	}

}

public class Program22_AbstractClassExample {
	public static void main(String[] args) {

		Triangle t = new Triangle();
		t.display();
		t.draw();
	}
}
