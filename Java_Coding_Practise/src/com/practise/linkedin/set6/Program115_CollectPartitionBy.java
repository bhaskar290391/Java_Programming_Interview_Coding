package com.practise.linkedin.set6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program115_CollectPartitionBy {
	public static void main(String[] args) {

		List<Integer> data=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Map<Boolean, List<Integer>> collect = data.stream()
				.collect(Collectors.partitioningBy(number -> number % 2 == 0));
		
		System.out.println("The even number ==>"+ collect.get(true));
		System.out.println("The odd number ==>"+ collect.get(false));
	}
}
