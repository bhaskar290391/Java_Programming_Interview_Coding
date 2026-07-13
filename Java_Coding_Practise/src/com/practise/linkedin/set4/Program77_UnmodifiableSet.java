package com.practise.linkedin.set4;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Program77_UnmodifiableSet {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(1, 4, 3, 5, 6, 7, 4, 3);
		Set<Integer> collect = data.stream().collect(Collectors.toUnmodifiableSet());
		System.out.println(collect);
	}
}
