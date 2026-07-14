package com.practise.linkedin.set3;

import java.util.Arrays;

public class Program44_CopyRange {
	public static void main(String[] args) {

		int original[]= {3,6,8,9,5};
		
		int[] copyOfRange = Arrays.copyOfRange(original, 1,3);
		
		System.out.println(Arrays.toString(copyOfRange));
	}
}
