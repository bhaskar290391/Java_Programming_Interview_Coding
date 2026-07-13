package com.practise.linkedin.set5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program81_StreamSortReverseOrder {
	public static void main(String[] args) {

		List<String> data = Arrays.asList("Shraddha", "Aniket", "Roshni");

		data.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
