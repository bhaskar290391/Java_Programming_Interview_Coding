package com.practise.linkedin.set4;

class Employee {

	private String name;
	private int age;
	private String department;

	public Employee(String name) {

		this(name, 0, "IT");
	}

	public Employee(String name, int age) {
		this(name, age, "IT");
	}

	public Employee(String name, int age, String department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}

	public void display() {
		System.out.println("Employee [name=" + name + ", age=" + age + ", department=" + department + "]");
	}

}

public class Program70_ThisExample {
	public static void main(String[] args) {

		Employee first = new Employee("Bhaskar");
		Employee second = new Employee("Maddy", 29);
		Employee third = new Employee("Sammy", 10, "IT");

		first.display();
		second.display();
		third.display();

	}
}
