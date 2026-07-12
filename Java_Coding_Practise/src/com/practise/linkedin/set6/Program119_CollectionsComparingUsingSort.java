package com.practise.linkedin.set6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program119_CollectionsComparingUsingSort {
	public static void main(String[] args) {

		List<String> cities = Arrays.asList("Mumbai", "Chennai", "Pune", "Bangalore");

		Collections.sort(cities, Comparator.comparing(String::length).reversed());

		Collections.sort(cities, Comparator.comparing(String::length));

		System.out.println("Cities ==>" + cities);
	}
}
