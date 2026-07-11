package com.practise.linkedin.set7;

import java.util.Optional;

public class Program138_IfPresentElseExample {
	public static void main(String[] args) {

		Optional<String> language = Optional.of("Java");

		language.ifPresentOrElse(name -> System.out.println("The language is " + name),
				() -> System.out.println("No data found"));

		Optional<String> empty = Optional.empty();

		empty.ifPresentOrElse(name -> System.out.println("The language is " + name),
				() -> System.out.println("No data found"));
	}
}
