package com.practise.linkedin.set4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program62_CollectingAndThenExample {
	public static void main(String[] args) {

		List<String> collect = Stream.of("bhaskar", "sammy", "kanishk").collect(Collectors
				.collectingAndThen(Collectors.toList(), list -> list.stream().map(name -> name.toUpperCase())))
				.collect(Collectors.toList());

		System.out.println("The collecting and Then : " + collect);
	}
}
