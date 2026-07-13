package com.practise.linkedin.set4;

public class Program75_StringLinesExample {
	public static void main(String[] args) {

		String data = "Task 1 : completed \n" + "Task 2: Pending \n" + "Task 3 : In Progress \n";

		System.out.println("The task :::");

		data.lines().forEach(System.out::println);

	}
}
