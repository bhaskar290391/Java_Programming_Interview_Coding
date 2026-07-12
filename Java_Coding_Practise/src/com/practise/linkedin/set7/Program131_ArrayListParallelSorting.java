package com.practise.linkedin.set7;

import java.util.Arrays;

public class Program131_ArrayListParallelSorting {
	public static void main(String[] args) {

		int[] numberList = { 1, 3, 8, 32, 98, 45, 92 };

		Arrays.parallelSort(numberList);

		System.out.println("The sorting array " + Arrays.toString(numberList));
	}
}
