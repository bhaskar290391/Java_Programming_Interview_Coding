package com.practise.linkedin.set1;

public class Program11_MultiCatchBlock {

	public static void main(String[] args) {

		try {

			int number = 100 / 0;
			System.out.println("Number is " + number);
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("The exception is " + e);
		}
	}

}
