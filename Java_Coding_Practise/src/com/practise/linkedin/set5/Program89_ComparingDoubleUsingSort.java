package com.practise.linkedin.set5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employees {
	String name;
	double salary;

	public Employees(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", salary=" + salary + "]";
	}

}

public class Program89_ComparingDoubleUsingSort {
	public static void main(String[] args) {

		List<Employees> data = Arrays.asList(new Employees("Bhaskar", 1000), new Employees("Kanishk", 56700),
				new Employees("Maddy", 68878));

		data.sort(Comparator.comparingDouble(emp -> emp.salary));

		System.out.println(data);

	}
}
