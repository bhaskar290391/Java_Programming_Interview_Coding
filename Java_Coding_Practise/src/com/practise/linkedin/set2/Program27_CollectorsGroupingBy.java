package com.practise.linkedin.set2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program27_CollectorsGroupingBy {
	public static void main(String[] args) {

		List<String> data = Arrays.asList("Pune", "Mumbai", "Chennai", "Banglore");

		Map<Character, List<String>> collect = data.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));

		System.out.println(collect);
	}
}
