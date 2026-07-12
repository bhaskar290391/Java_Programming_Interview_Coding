package com.practise.linkedin.set7;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Program130_StreamGenerateExample {
	public static void main(String[] args) {

		AtomicInteger number = new AtomicInteger(0);
		Stream.generate(() -> number.addAndGet(2)).limit(10).forEach(System.out::println);
	}
}
