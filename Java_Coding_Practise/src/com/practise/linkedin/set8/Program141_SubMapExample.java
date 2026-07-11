package com.practise.linkedin.set8;

import java.util.SortedMap;
import java.util.TreeMap;

public class Program141_SubMapExample {
	public static void main(String[] args) {

		TreeMap<Integer, String> data = new TreeMap<>();
		data.put(201, "Shradha");
		data.put(105, "Karan");
		data.put(154, "Mohit");
		data.put(248, "Viraj");

		System.out.println(data);

		SortedMap<Integer, String> subMap = data.subMap(135, 210);
		System.out.println(subMap);
	}
}
