package com.practise.linkedin.set2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Program12_PredicateExample {
	public static void main(String[] args) {
		
		List<Integer> data=Arrays.asList(2,7,5,4,9,6,3,1);
		Predicate<Integer> isEven=number -> number % 2==0;
		data.stream().filter(isEven).forEach(System.out::println);
	}
}
