package com.practise.linkedin.set2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program17_CollectorsJoining {
	public static void main(String[] args) {

		List<String> data = Arrays.asList("bhaskar", "sammy", "Kanishk", "Jerry");

		String formatedString = data.stream().collect(Collectors.joining(",", "List of Element : [", "]"));

		System.out.println("The Formatted string is " + formatedString);

	}
}
