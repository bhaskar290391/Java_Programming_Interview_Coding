package com.practise.linkedin.set3;

import java.util.ArrayList;

public class Program48_ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> data = new ArrayList<>();
		data.add("Bhaskar");
		data.add("kanishk");
		data.add("sammy");

		data.remove("Bhaskar");
		data.add(2, "Soni");

		System.out.println("The data is " + data);
	}
}
