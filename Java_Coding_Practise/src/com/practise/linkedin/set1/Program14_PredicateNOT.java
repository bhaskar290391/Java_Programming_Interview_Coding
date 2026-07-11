package com.practise.linkedin.set1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Program14_PredicateNOT {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(2, 7, 5, 4, 9, 6, 3, 1);

		System.out.println(data.stream().filter(Predicate.not(number -> number % 2 == 0)).collect(Collectors.toList()));
	}
}
