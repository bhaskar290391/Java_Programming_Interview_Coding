package com.practise.linkedin.set3;

public class Program55_StringbuilderReverse {
	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder("Bhaskar");
		System.out.println("Original text :" + builder.toString());

		builder.reverse();
		System.out.println("The reverse ==> " + builder.toString());
	}
}
