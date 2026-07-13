package com.practise.linkedin.set5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program91_CollectorsToUnModifiableList {
	public static void main(String[] args) {

		List<String> datList = Arrays.asList("Bhaskar", "Kanishk", "shetty");
		List<String> unChangebleList = datList.stream().collect(Collectors.toUnmodifiableList());
		System.out.println("unChangebleList ==> " + unChangebleList);
	}
}
