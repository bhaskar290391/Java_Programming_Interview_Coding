package com.practise.linkedin.set5;

import java.util.Arrays;
import java.util.List;

class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}

public class Program84_MapToIntSum {
	public static void main(String[] args) {

		List<Employee> data = Arrays.asList(new Employee("Bhaskar", 1000), new Employee("Kanishk", 56700),
				new Employee("Maddy", 68878));

		int sum = data.stream().mapToInt(emp -> emp.salary).sum();
		System.out.println("The sum is ==> " + sum);
	}
}
