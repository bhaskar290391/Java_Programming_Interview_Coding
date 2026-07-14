package com.practise.linkedin.set2;

import java.util.ArrayList;
import java.util.List;

public class Program26_RetailAllOfCollection {
	public static void main(String[] args) {

		List<String> studentList = new ArrayList<>();
		studentList.add("Bhaskar");
		studentList.add("Kanishk");
		studentList.add("Sammy");

		List<String> mathsStudent = new ArrayList<>();
		mathsStudent.add("Kanishk");
		mathsStudent.add("Soni");

		studentList.retainAll(mathsStudent);

		System.out.println("The Studnet List ==>" + studentList);
	}
}
