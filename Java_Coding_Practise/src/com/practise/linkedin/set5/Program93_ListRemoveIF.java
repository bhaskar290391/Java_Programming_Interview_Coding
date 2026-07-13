package com.practise.linkedin.set5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program93_ListRemoveIF {
	public static void main(String[] args) {

		List<Integer> data = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		data.removeIf(num -> num % 2 == 0);

		System.out.println(data);
	}
}
