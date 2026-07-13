package com.practise.linkedin.set5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program96_UnModifiableMapFromList {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(2, 4, 6, 8, 10);

		System.out.println(data.stream().collect(Collectors.toUnmodifiableMap(num -> num, num -> num * num)));
	}
}
