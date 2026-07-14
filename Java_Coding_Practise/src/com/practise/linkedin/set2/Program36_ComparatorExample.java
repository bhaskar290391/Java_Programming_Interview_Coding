package com.practise.linkedin.set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparator<Student> {

	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}

public class Program36_ComparatorExample {
	public static void main(String[] args) {

		List<Student> data = new ArrayList<>(
				Arrays.asList(new Student("Bhaskar", 36), new Student("kanishk", 5), new Student("Sammy", 3)));

		Collections.sort(data,new Student());

		System.out.println(data);
	}
}
