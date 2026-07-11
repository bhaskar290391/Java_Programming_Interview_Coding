package com.practise.linkedin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program10_MethodReference {
	public static void main(String[] args) {

		List<String> data = Arrays.asList("Kanishk", "Samyuktha", "Bhaskar");

		System.out.println("Before sorting " + data);

		Collections.sort(data, String::compareToIgnoreCase);

		System.out.println("After sorting " + data);
	}
}
