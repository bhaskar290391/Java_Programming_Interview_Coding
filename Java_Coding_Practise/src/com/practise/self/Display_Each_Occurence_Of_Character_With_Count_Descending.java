package com.practise.self;

import java.util.Map;
import java.util.stream.Collectors;

public class Display_Each_Occurence_Of_Character_With_Count_Descending {

	public static void main(String[] args) {

		/*
		 * String name ="Bhaskar Mudaliyar" want to print each character and number of
		 * occurence in string and display them in descending order
		 */

		String name = "Bhaskar Mudaliyar";

		Map<Character, Long> collect = name.replace(" ", "").chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(collect);

		collect.entrySet().stream().sorted((o1, o2) -> o2.getKey().compareTo(o1.getKey())).forEach(System.out::println);;

	}

}
