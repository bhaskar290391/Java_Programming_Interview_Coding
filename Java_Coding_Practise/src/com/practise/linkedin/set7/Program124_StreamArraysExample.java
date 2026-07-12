package com.practise.linkedin.set7;

import java.util.Arrays;
import java.util.List;

public class Program124_StreamArraysExample {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(1, 4, 2, 6, 7, 9, 5);

		Integer[] dataArray = data.stream().filter(number -> number % 2 == 0).toArray(Integer[]::new);

		System.out.println("The final Array " + Arrays.toString(dataArray));
	}
}
