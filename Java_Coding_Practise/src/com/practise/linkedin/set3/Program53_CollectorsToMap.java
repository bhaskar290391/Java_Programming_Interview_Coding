package com.practise.linkedin.set3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program53_CollectorsToMap {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(3, 6, 5, 4, 8, 9);

		data.stream().collect(Collectors.toMap(number -> number, number -> number * number))
				.forEach((key, value) -> System.out.println(key + " : " + value));
	}
}
