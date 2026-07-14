package com.practise.linkedin.set3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program45_AveragingDouble {
	public static void main(String[] args) {

		List<Integer> data= Arrays.asList(1,2,3,4,5,6,8);
		
		System.out.println(
		data.stream().collect(Collectors.averagingDouble(nuber -> nuber)));
	}
}
