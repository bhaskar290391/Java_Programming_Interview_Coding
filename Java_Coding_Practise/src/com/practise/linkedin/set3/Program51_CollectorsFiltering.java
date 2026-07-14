package com.practise.linkedin.set3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program51_CollectorsFiltering {
	public static void main(String[] args) {

		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> collect = data.stream().collect(Collectors.filtering(n -> n % 2 == 0, Collectors.toList()));

		System.out.println("collect " + collect);
	}
}
