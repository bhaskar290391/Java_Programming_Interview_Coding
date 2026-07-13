package com.practise.linkedin.set5;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Program95_ListIteratorExample {
	public static void main(String[] args) {

		List<String> language = Arrays.asList("Java", "Microservice", "C+");

		ListIterator<String> iterators = language.listIterator();

		iterators.forEachRemaining(System.out::println);

		while (iterators.hasPrevious()) {
			System.out.println(iterators.previous());
		}
	}
}
