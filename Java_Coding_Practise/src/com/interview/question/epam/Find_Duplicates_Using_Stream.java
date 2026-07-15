package com.interview.question.epam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Find_Duplicates_Using_Stream {
	public static void main(String[] args) {

		int[] data = { 1, 2, 1, 3, 3 }; // Find the duplicates in the array stream and converted in List<int[]>

		Map<Integer, Long> collect = Arrays.stream(data).boxed()
				.collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println(collect);

		System.out.println();
		List<int[]> entryKey = collect.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.map(entry -> new int[] { entry.getKey() }).collect(Collectors.toList());

		entryKey.forEach(key -> System.out.println(Arrays.toString(key)));

	}
}
