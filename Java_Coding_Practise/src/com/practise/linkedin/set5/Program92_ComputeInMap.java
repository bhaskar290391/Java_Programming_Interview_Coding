package com.practise.linkedin.set5;

import java.util.HashMap;

public class Program92_ComputeInMap {
	public static void main(String[] args) {

		String data[] = { "Bhaskar", "Sammy", "Kanishk", "Bhaskar" };

		HashMap<String, Integer> map = new HashMap<>();
		for (String name : data) {
			map.compute(name, (key, value) -> (value == null) ? 1 : value + 1);
		}

		System.out.println("The map is " + map);
	}
}
