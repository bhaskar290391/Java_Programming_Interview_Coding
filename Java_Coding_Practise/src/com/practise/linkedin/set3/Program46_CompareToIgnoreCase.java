package com.practise.linkedin.set3;

public class Program46_CompareToIgnoreCase {

	public static void main(String[] args) {

		String name = "Bhaskar";
		String name2 = "bhaskar";

		int data = name.compareToIgnoreCase(name2);
		if (data == 0) {
			System.out.println("content are equals");
		} else {
			System.out.println("Not equals");
		}

	}

}
