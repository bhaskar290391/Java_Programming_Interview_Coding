package com.practise.linkedin.set5;

import java.util.HashMap;
import java.util.Map;

public class Program100_HashmapExample {
	public static void main(String[] args) {

		HashMap<String, Integer> data = new HashMap<>();
		data.put("Shiva", 1);
		data.put("karthik", 29);
		data.put("Test", 35);

		for (Map.Entry string : data.entrySet()) {
			System.out.println(string.getKey() + " " + string.getValue());
		}
	}
}
