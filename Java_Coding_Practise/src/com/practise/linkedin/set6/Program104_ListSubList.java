package com.practise.linkedin.set6;

import java.util.Arrays;
import java.util.List;

public class Program104_ListSubList {
	public static void main(String[] args) {

		List<String> data = Arrays.asList("Bhaskar", "Kanishk", "Maddy", "sammy");
		List<String> subList = data.subList(0, 3);

		System.out.println("The sublist " + subList);
	}
}
