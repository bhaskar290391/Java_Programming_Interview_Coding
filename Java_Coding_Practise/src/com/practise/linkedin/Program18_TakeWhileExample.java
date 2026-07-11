package com.practise.linkedin;

import java.util.Arrays;
import java.util.List;

public class Program18_TakeWhileExample {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(1, 4, 5, 8, 4, 10, 3, 2);
		data.stream().takeWhile(number -> number > 8).forEach(System.out::println);
	}
}
