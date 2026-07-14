package com.practise.linkedin.set2;

import java.util.Optional;

public class Program24_OptionalClassExample {
	public static void main(String[] args) {

		Optional<String> name = Optional.ofNullable("Bhaskar");
		System.out.println("The value of optional value " + name.get());

		Optional<String> data = Optional.ofNullable(null);
		data.ifPresent(value -> System.out.println("The value is " + value));

		System.out.println(data.orElse("0"));
	}
}
