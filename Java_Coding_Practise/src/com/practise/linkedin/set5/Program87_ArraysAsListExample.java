package com.practise.linkedin.set5;

import java.util.Arrays;
import java.util.List;

public class Program87_ArraysAsListExample {
	public static void main(String[] args) {

		String data[] = { "Bhaskar", "Kanishk", "Sammy" };

		List<String> datas = Arrays.asList(data);
		System.out.println("The datas ==> " + datas);
	}
}
