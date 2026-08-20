package com.practise.linkedin.set8;

import java.util.List;

public class Program149_NoneMatch {
	public static void main(String[] args) {

		List<Integer> data= List.of(35,34,45,9);
		System.out.println(
		data.stream().noneMatch(number -> number <0));
	}
}
