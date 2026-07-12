package com.practise.linkedin.set7;

import java.util.Optional;

public class Program129_OptionalOrElseGet {
	public static void main(String[] args) {

		Integer optionalFromDB = null;
		Optional<Integer> discount = Optional.ofNullable(optionalFromDB);

		int value = discount.orElseGet(() -> 10);
		System.out.println(value);
	}
}
