package com.practise.linkedin.set2;

import java.util.Arrays;
import java.util.List;

public class Program29_ReduceProductEven {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println(data.stream().filter(num -> num % 2 == 0).reduce(1, (a, b) -> a * b));

	}
}
