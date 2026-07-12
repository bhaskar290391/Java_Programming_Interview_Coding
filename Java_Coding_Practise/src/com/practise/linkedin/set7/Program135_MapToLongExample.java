package com.practise.linkedin.set7;

import java.util.Arrays;
import java.util.List;

public class Program135_MapToLongExample {
	public static void main(String[] args) {

		List<Integer> listData = Arrays.asList(10, 40, 53, 45);

		Long sum = listData.stream().mapToLong(number -> number).sum();
		System.out.println("The sum in long " + sum);
	}
}
