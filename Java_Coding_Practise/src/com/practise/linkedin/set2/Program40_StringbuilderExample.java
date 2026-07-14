package com.practise.linkedin.set2;

public class Program40_StringbuilderExample {
	public static void main(String[] args) {

		StringBuilder text = new StringBuilder();
		text.append("Bhaskar").append(" Mudaliyar ").replace(7, 9, "Jayaraman");

		System.out.println(text);
	}
}
