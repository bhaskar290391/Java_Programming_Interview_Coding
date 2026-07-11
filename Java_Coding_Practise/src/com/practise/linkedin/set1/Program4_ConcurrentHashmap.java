package com.practise.linkedin.set1;

import java.util.concurrent.ConcurrentHashMap;

public class Program4_ConcurrentHashmap {
	public static void main(String[] args) {

		ConcurrentHashMap<String, Integer> data = new ConcurrentHashMap<>();
		data.put("key1", 11);
		data.put("key2", 32);
		data.put("key2", 28);

		data.putIfAbsent("key2", 98);
		data.putIfAbsent("key3", 35);

		System.out.println(data);

	}
}
