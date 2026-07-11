package com.practise.linkedin;

interface Shape{
	
	public void draw();
	
	default void displayInformation() {
		System.out.println("I am display method");
	}
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("I am circle draw method");
	}
	
}
public class Program6_DefaultMethodExample {
	public static void main(String[] args) {

		Circle c=new Circle();
		c.displayInformation();
		c.draw();
	}
}
