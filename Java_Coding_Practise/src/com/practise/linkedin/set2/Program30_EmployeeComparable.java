package com.practise.linkedin.set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {

	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee employee) {
		return Double.compare(this.salary, employee.salary);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}

public class Program30_EmployeeComparable {
	public static void main(String[] args) {

		List<Employee> data = Arrays.asList(new Employee("Bhaskar", 28767), new Employee("Kanishk", 567),
				new Employee("Sammy", 7677));

		Collections.sort(data);

		System.out.println(data);
	}
}
