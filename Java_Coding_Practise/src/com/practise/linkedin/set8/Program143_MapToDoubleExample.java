package com.practise.linkedin.set8;

import java.util.List;

public class Program143_MapToDoubleExample {
	public static void main(String[] args) {

		List<Double> data= List.of(9.23,23.45,17.38);
		Double sum=data.stream().mapToDouble(number -> number).sum();
		
		System.out.println("The sum is "+ sum);
	}
}
