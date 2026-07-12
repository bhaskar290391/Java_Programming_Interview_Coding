package com.practise.linkedin.set6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program118_ComputeIfAbsent {
	public static void main(String[] args) {

		Map<String, List<String>> data = new HashMap<>();

		data.put("Anish", new ArrayList<>(Arrays.asList("Java", "c++")));
		data.put("Chhena", new ArrayList<>(Arrays.asList("Python")));

		data.computeIfAbsent("Test", value -> new ArrayList<>()).add("D");
		System.out.println(data);
	}
}
