package com.practise.linkedin.set8;

import java.util.HashMap;
import java.util.Map;

public class Program151_ContainsKeyDemo {

	public static void main(String[] args) {

		Map<Integer, String> userData = new HashMap<>();
		userData.put(121, "Bhaskar");
		userData.put(122, "Kanishk");
		userData.put(123, "Sammy");

		System.out.println(userData);

		if (userData.containsKey(122)) {
			System.out.println("User exist with value ===>" + userData.get(122));
		}

		else {
			System.out.println("User not exist");
		}

	}
}
