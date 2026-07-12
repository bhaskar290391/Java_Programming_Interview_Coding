package com.practise.linkedin.set7;

import java.util.HashMap;
import java.util.Map;

public class Program125_MapEntryExample {
	public static void main(String[] args) {

		Map<String, Integer> marks = new HashMap<>();

		marks.put("English", 41);
		marks.put("Science", 97);
		marks.put("Maths", 145);

		for (Map.Entry<String, Integer> data : marks.entrySet()) {

			System.out.println("The Key is " + data.getKey() + " , The Value is " + data.getValue());
		}
	}
}
