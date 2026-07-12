package com.practise.linkedin.set6;

import java.util.HashMap;
import java.util.Map;

public class Program105_ComputeIfAbsent {
	public static void main(String[] args) {

		Map<String, Integer> accessories = new HashMap<>();
		accessories.put("Notebook", 20);
		accessories.put("Pen", 5);

		accessories.computeIfPresent("Pen", (_, value) -> value + 20);
		accessories.computeIfPresent("Erasee", (_, value) -> value + 5);

		System.out.println(accessories);
	}
}
