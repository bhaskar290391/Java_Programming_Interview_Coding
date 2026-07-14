package com.practise.linkedin.set3;

import java.util.Map;

public class Program58_MapOfEntries {
	public static void main(String[] args) {

		Map<String, Integer> ofEntries = Map.ofEntries(Map.entry("Bhaskar", 29), Map.entry("Kanishk", 31),
				Map.entry("Sammy", 10));

		ofEntries.forEach((key, value) -> System.out.println("The key " + key + " the value is " + value));

	}
}
