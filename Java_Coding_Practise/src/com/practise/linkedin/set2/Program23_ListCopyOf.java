package com.practise.linkedin.set2;

import java.util.ArrayList;
import java.util.List;

public class Program23_ListCopyOf {
	public static void main(String[] args) {

		List<String> studentList = new ArrayList<>();
		studentList.add("Bhaskar");
		studentList.add("Kanishk");
		studentList.add("Sammy");

		List<String> unmodifiableList = List.copyOf(studentList);

		try {
			unmodifiableList.add("Soni");
		} catch (Exception e) {
			System.out.println("Cannot Modifying the result ");
		}
	}
}
