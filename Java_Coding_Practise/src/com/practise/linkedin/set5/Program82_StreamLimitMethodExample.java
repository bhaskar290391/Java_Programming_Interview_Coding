package com.practise.linkedin.set5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program82_StreamLimitMethodExample {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(data.stream().limit(5).collect(Collectors.toList()));
	}
}
