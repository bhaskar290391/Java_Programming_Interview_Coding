package com.practise.self;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Display_Word_Respecting_Count_Java8 {
	public static void main(String[] args) {

		/*
		 * String str="This this is is done by Bhaskar Mudaliyar" want to display word
		 * and respective count using java 8
		 */

		String str = "This this is is done by Bhaskar Mudaliyar";
		
		System.out.println(
		Arrays.stream(str.split("\\s")).collect(Collectors.groupingBy(word -> word.toLowerCase() ,Collectors.counting())));
	}

}
