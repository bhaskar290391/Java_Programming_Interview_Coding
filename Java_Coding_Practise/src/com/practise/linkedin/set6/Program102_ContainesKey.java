package com.practise.linkedin.set6;

import java.util.HashMap;
import java.util.Map;

public class Program102_ContainesKey {
	public static void main(String[] args) {

		Map<Integer, String> data = new HashMap<>();
		data.put(101, "Bhaskar");
		data.put(102, "Kanishk");
		data.put(103, "Maddy");

		System.out.println(data);

		int rollNumberToCheck = 102;
		if (data.containsKey(rollNumberToCheck)) {
			System.out.println("Roll number ==>" + rollNumberToCheck + " is available " + data.get(rollNumberToCheck));
		} else {
			System.out.println("Sudent not found with roll number" + rollNumberToCheck);
		}
	}
}
