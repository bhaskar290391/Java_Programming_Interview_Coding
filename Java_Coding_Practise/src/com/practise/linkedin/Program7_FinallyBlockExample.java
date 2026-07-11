package com.practise.linkedin;

public class Program7_FinallyBlockExample {
	public static void main(String[] args) {
		
		try {
			int number=28/0;
			System.out.println("Number is " +number);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finally block is executed");
		}
	}
}
