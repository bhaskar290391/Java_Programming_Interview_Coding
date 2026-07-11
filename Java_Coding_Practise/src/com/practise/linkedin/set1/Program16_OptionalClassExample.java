package com.practise.linkedin.set1;

import java.util.Optional;

public class Program16_OptionalClassExample {
	public static void main(String[] args) {

		Optional<Integer> data = Optional.of(684);
		Optional<Integer> eptyValue = Optional.empty();

		System.out.println("The value is " + data.orElse(0));
		System.out.println("The value is " + eptyValue.orElse(10));
	}
}
