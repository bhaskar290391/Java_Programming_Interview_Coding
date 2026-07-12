package com.practise.linkedin.set7;

public class Program128_StringBuilderAppend {
	public static void main(String[] args) {

		String firstName = "Bhaskar";
		String lastName = "Mudaliyar";

		StringBuilder fullName = new StringBuilder();
		fullName.append(firstName).append(" ").append(lastName);

		System.out.println("FullName is " + fullName);
	}
}
