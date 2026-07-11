package com.practise.linkedin.set2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeDetails {
	private int id;
	private String name;

	public EmployeeDetails(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + "]";
	}

}

public class Program13_CollectorsExample {
	public static void main(String[] args) {

		List<EmployeeDetails> details = new ArrayList<>();
		details.add(new EmployeeDetails(1, "Bhaskar"));
		details.add(new EmployeeDetails(2, "Maddy"));
		details.add(new EmployeeDetails(3, "Sammy"));

		System.out.println(details.stream().map(employee -> employee.getName()).collect(Collectors.toList()));
	}
}
