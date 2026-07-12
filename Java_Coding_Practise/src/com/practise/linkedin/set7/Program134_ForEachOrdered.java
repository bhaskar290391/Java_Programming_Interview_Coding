package com.practise.linkedin.set7;

import java.util.Arrays;
import java.util.List;

public class Program134_ForEachOrdered {
	public static void main(String[] args) {

		List<Integer> data =Arrays.asList(1,3454,645,8954,11);
		data.stream().forEachOrdered(System.out::println);
	}
}
