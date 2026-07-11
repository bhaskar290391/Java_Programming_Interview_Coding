package com.practise.linkedin.set7;

import java.util.List;
import java.util.stream.Collectors;

public class Program139_MapExample {
	public static void main(String[] args) {

		List<Integer> originalNumber = List.of(2, 5, 4, 1, 3);

		List<Integer> squareOfNumber = originalNumber.stream().map(number -> number * number)
				.collect(Collectors.toList());

		System.out.println("The original Number " + originalNumber);
		System.out.println("The Final number " + squareOfNumber);

	}
}
