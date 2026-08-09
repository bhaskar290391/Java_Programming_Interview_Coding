package com.practise.linkedin.set8;

import java.util.List;
import java.util.stream.IntStream;

public class Program148_BoxedDemo {
	public static void main(String[] args) {

		List<Integer> data = IntStream.rangeClosed(1, 5).boxed().toList();
		System.out.println("The boxed demo ==>" + data);
	}
}
