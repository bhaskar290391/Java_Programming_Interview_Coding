package com.practise.linkedin.set5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Program83_FindFirstUsingStream {
	public static void main(String[] args) {

		List<String> data = Arrays.asList("Anish", "Shraddha", "Swapnil");
		Optional<String> firstData = data.stream().filter(name -> name.startsWith("S")).findFirst();

		firstData.ifPresent(System.out::println);
	}
}
