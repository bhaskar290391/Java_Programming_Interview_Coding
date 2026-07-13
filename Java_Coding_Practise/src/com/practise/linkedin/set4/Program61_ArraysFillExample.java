package com.practise.linkedin.set4;

import java.util.Arrays;

public class Program61_ArraysFillExample {
	public static void main(String[] args) {

		int numer[] = new int[9];

		Arrays.fill(numer, 29);

		System.out.println(Arrays.toString(numer));

		Arrays.fill(numer, 1, 3, 20);

		System.out.println(Arrays.toString(numer));
	}

}
