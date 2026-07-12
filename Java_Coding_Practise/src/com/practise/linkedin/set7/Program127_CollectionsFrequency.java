package com.practise.linkedin.set7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program127_CollectionsFrequency {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(85, 90, 92, 75, 89, 90, 86, 90);
		int count = Collections.frequency(data, 90);

		System.out.println("Total Number of studente secured 90 marks " + count);
	}
}
