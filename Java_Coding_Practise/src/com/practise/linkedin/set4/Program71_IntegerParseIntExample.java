package com.practise.linkedin.set4;

public class Program71_IntegerParseIntExample {
	public static void main(String[] args) {
		String data = "35";
		try {

			int num = Integer.parseInt(data);
			System.out.println("The formated number :" + num);

			int square = num * num;
			System.out.println("The square of given number :" + square);

		} catch (NumberFormatException e) {
			System.out.println("Number format exception " + e.getMessage());
		}
	}
}
