package com.practise.linkedin.set6;

import java.util.Arrays;
import java.util.List;

public class Program120_StreamAnyMatch {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(1, 3, 2, 9, 5);

		boolean isEven = data.stream().anyMatch(number -> number % 2 == 0);

		if (isEven) {
			System.out.println("One even nummber is at aleast present");
		} else {
			System.out.println("No even Number");
		}
	}
}
