package com.practise.linkedin.set7;

import java.util.List;
import java.util.stream.Collectors;

public class Program140_PeekExample {
	public static void main(String[] args) {

		List<String> data = List.of("Shraddha", "Akshata", "Rohit");

		List<String> finalResult = data.stream().filter(str -> str.length() > 5).peek(System.out::println)
				.map(str -> str.toUpperCase()).peek(System.out::println).collect(Collectors.toList());

		System.out.println("The result" + finalResult);
	}
}
