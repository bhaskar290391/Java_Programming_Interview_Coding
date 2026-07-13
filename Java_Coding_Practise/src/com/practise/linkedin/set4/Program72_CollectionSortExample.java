package com.practise.linkedin.set4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program72_CollectionSortExample {
	public static void main(String[] args) {

		List<String> employeeList = Arrays.asList("Minal", "Keshav", "Shraddha");

		Collections.sort(employeeList);
		System.out.println("Sorted List " + employeeList);
	}
}
