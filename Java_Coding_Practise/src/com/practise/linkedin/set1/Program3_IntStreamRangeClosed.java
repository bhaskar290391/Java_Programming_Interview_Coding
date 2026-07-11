package com.practise.linkedin.set1;

import java.util.stream.IntStream;

public class Program3_IntStreamRangeClosed {
	public static void main(String[] args) {

		//This program will display all odd numbers within range 2 to 20 Using intStream
		
		IntStream.rangeClosed(1, 30).filter(number -> number %2 != 0).forEach(System.out::println);
	}
}
