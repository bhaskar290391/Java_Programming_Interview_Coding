package com.practise.linkedin.set4;

import java.util.Optional;

public class Program78_OptionalOrElse {
	public static void main(String[] args) {

		Optional<String> ofNullable = Optional.ofNullable(null);
		String data = ofNullable.orElse("Default Value");
		System.out.println("The value of data " + data);
	}
}
