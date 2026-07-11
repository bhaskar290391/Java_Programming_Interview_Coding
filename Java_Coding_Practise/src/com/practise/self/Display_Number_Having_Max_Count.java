package com.practise.self;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Display_Number_Having_Max_Count {
	public static void main(String[] args) {

		/*
		 * List of number 12,11,10,12,14,11,9,9 want to display number which is having
		 * max count
		 */

		List<Integer> data = Arrays.asList(12, 11, 10, 12, 14, 11, 9, 9,11);

		System.out.println(data.stream().collect(Collectors.groupingBy(number -> number, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());
	}
}
