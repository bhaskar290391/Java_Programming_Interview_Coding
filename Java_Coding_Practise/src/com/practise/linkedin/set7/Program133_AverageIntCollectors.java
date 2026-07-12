package com.practise.linkedin.set7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program133_AverageIntCollectors {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(24, 51, 23, 25);

		Double collect = data.stream().collect(Collectors.averagingInt(number -> number));

		System.out.println("The average of the numbers " + collect);
	}
}
