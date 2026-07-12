package com.practise.linkedin.set7;

import java.util.Arrays;
import java.util.List;

public class Program126_AllMatchExample {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(2, 4, 6, 8, 12, 30, 26);

		boolean flag = data.stream().allMatch(number -> number % 2 == 0);

		System.out.println("The all Match data is " + flag);
	}
}
