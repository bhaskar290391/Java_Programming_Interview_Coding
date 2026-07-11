package com.practise.self;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class First_Non_Repeating_Character_From_String {
	public static void main(String[] args) {

		// Find the first Non-repeating character from string using Java8 Stream API: "swiss".

		String data = "swiss";

		Map<Character, Long> charData = data.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

		Character nonRepeating = charData.entrySet().stream().filter(entry -> entry.getValue() == 1)
				.map(entry -> entry.getKey()).findFirst().orElse(null);
		
		System.out.println("Non Repoeating charcater ==>"+ nonRepeating);
	}
}
