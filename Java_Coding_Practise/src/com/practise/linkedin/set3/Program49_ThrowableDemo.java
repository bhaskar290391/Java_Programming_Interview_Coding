package com.practise.linkedin.set3;

public class Program49_ThrowableDemo {
	public static void main(String[] args) {

		try {
			int division = divide(20, 0);
			System.out.println("The division of two number is " + division);
		} catch (ArithmeticException e) {
			System.out.println("Arithmethic Exception occured " + e.getMessage());
		}

	}

	private static int divide(int num, int denom) {
		
		if(denom ==0) {
			throw new ArithmeticException("Division by Zero ");
		}
		return (num/denom);
	}
}
