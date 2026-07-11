package com.practise.linkedin;

import java.util.Arrays;
import java.util.List;

public class Program8_StreamSorting {
	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(11, 69, 45, 20, 58, 37, 67, -4, 0);

		asList.stream().sorted().forEach(System.out::println);
	}
}
