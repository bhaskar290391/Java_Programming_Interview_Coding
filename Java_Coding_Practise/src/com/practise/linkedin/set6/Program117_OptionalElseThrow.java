package com.practise.linkedin.set6;

import java.util.Optional;

public class Program117_OptionalElseThrow {
	public static void main(String[] args) {

		Optional<String> data = Optional.empty();

		try {

			String value = data.orElseThrow(() -> new IllegalArgumentException("Email is required !!!"));
			System.out.println("Email is " + value);
		} catch (IllegalArgumentException e) {
			System.out.println("The Exception " + e.getMessage());
		}
	}
}
