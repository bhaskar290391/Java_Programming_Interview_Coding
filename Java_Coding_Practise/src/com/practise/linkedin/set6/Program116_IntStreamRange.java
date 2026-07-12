package com.practise.linkedin.set6;

import java.util.stream.IntStream;

public class Program116_IntStreamRange {
	public static void main(String[] args) {

		System.out.println("The number is ==> " );
		IntStream.range(1, 10).forEach(System.out::println);
	}
}
