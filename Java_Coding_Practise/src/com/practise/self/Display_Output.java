package com.practise.self;

import java.util.Set;
import java.util.stream.Collectors;

public class Display_Output {
	public static void main(String[] args) {
	       String A = "characters";
	        String B = "alphabets";

	        // Convert strings to sets of characters
	        Set<Character> setA = A.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
	        Set<Character> setB = B.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

	        // Find the symmetric difference (characters in either A or B but not both)
	        Set<Character> symmetricDifference = setA.stream()
	                .filter(c -> !setB.contains(c))
	                .collect(Collectors.toSet());

	        symmetricDifference.addAll(setB.stream()
	                .filter(c -> !setA.contains(c))
	                .collect(Collectors.toSet()));

	        System.out.println("Output: " + symmetricDifference);

	}
}
