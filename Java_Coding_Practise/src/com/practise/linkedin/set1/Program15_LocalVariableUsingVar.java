package com.practise.linkedin.set1;

import java.util.Arrays;
import java.util.List;

public class Program15_LocalVariableUsingVar {
	public static void main(String[] args) {

		List<String> data = Arrays.asList("Bhaskar", "Mudaliyar", "Jayaraman");

		for (var string : data) {
			System.out.println("The value for iteration :" + string);
		}
	}
}
