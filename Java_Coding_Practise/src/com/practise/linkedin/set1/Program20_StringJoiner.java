package com.practise.linkedin.set1;

import java.util.StringJoiner;

public class Program20_StringJoiner {
	public static void main(String[] args) {

		StringJoiner data = new StringJoiner(",", "{", "}");
		data.add("bhaskar");
		data.add("Maddy");
		data.add("kanishk");
		
		System.out.println("The employer list :"+ data.toString());
	}
}
