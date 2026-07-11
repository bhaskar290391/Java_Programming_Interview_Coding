package com.practise.self;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicates_For_IntArray {
	public static void main(String[] args) {

		int a[] = { 1, 3, 3, 5, 7, 5 }; // o/p == 3,5

		List<Integer> data = Arrays.stream(a).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).collect(Collectors.toList());
		
		System.out.println(data);
	}
}
