package com.practise.linkedin.set3;

class Parent {

	int num;

	public Parent(int num) {
		this.num = num;
	}

	public void display() {
		System.out.println("The value of parent number " + num);
	}

}

class Child extends Parent {

	int second;

	public Child(int num, int second) {
		super(num);
		this.second = second;
	}

	public void display() {
		super.display();
		System.out.println("The value second number " + second);
	}

}

public class Program42_SuperExample {
	public static void main(String[] args) {
		Child thread = new Child(29, 15);
		thread.display();
	}

}
