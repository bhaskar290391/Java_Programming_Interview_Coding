package com.practise.linkedin.set3;

import java.util.Arrays;
import java.util.List;

public class Program57_ForEachExample {

	public static void main(String[] args) {

		List<String> data = Arrays.asList("Bhaskar", "Kanishk", "Maddy");

		data.forEach(System.out::println);
	}
}
