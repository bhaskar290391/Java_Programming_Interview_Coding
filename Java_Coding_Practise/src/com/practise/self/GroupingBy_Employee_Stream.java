package com.practise.self;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int empId;
	private String empName;
	private double empSalary;
	private String empDepartment;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double empSalary, String empDepartment) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDepartment = empDepartment;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDepartment="
				+ empDepartment + "]";
	}

}

public class GroupingBy_Employee_Stream {
	public static void main(String[] args) {

		/*
		 * List of Employee having empId,EmpName, empSalary, department output : 1. max
		 * salaried employee of each department 2. Group by department count
		 * 
		 */

		List<Employee> employees = List.of(new Employee(1, "John", 50000, "IT"), new Employee(2, "Doe", 60000, "IT"),
				new Employee(3, "Alice", 70000, "HR"), new Employee(4, "Bob", 55000, "HR"),
				new Employee(5, "Charlie", 80000, "Finance"));

		System.out.println(
				employees.stream().collect(Collectors.groupingBy(Employee::getEmpDepartment, Collectors.counting())));

		System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getEmpDepartment,
				Collectors.maxBy(Comparator.comparingDouble(Employee::getEmpSalary)))));

	}
}
