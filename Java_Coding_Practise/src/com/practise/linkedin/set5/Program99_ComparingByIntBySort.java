package com.practise.linkedin.set5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employeess {
	String name;
	int salary;

	public Employeess(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", salary=" + salary + "]";
	}

}

public class Program99_ComparingByIntBySort {
	public static void main(String[] args) {

		List<Employeess> data = Arrays.asList(new Employeess("Bhaskar", 1000), new Employeess("Kanishk", 56700),
				new Employeess("Maddy", 68878));

		data.sort(Comparator.comparingInt(emp -> emp.salary));

		System.out.println(data);

	}
}
