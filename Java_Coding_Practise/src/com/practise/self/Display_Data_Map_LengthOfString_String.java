package com.practise.self;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Display_Data_Map_LengthOfString_String {

	public static void main(String[] args) {

		List<String> data = List.of("bhaskar", "test", "to", "microservice");

		Map<Integer, String> result = data.stream().collect(Collectors.toMap(String::length, string -> string));
		System.out.println("The result is " + result);
	}

}
