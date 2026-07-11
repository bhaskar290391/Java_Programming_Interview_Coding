package com.practise.linkedin;

record Employee(Integer id, String name) {

}

public class Program2_RecordClasses {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "Bhaskar");
		Employee employees = new Employee(2, "bhaskar");
		System.out.println(employee.name().equals(employees.name()));
	}
}
