package com.practise.linkedin.set5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program94_StreamDistinct {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(1, 4, 3, 4, 4, 7, 9, 9);
		System.out.println(data.stream().distinct().collect(Collectors.toList()));
	}
}
