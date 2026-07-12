package com.practise.linkedin.set7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program123_StreamMap {
	public static void main(String[] args) {

		List<String> data = Arrays.asList("Bhaskar", "Kanishk", "Maddy");
		System.out.println(data.stream().map(String::toUpperCase).collect(Collectors.toList()));
	}
}
