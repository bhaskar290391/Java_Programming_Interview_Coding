package com.practise.linkedin;

class Parent{
	public static void display() {
		System.out.println("Parent class display()");
	}
}

class Child extends Parent{
	public static void display() {
		System.out.println("Child class display()");
	}
}

public class Program1_StaticMethodInInheritance {

	public static void main(String[] args) {
		
		Parent p=new Child();
		p.display();

	}

}
