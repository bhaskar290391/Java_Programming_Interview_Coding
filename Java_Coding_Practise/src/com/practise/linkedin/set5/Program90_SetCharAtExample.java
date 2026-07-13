package com.practise.linkedin.set5;

public class Program90_SetCharAtExample {
	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder("Bhasker Mudaliyar");
		builder.setCharAt(5, 'a');
		System.out.println(builder);
	}
}
