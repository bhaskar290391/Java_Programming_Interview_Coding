package com.practise.linkedin.set4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program79_CollectorsCountingExample {
	public static void main(String[] args) {

		List<String> data = Arrays.asList("Anish", "Shweta", "Amar", "Bhaskar");

		Map<Character, Long> collect = data.stream()
				.collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting()));
		
		System.out.println("The count ==> "+ collect);
	}
}
