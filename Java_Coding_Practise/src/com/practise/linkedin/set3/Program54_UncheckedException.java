package com.practise.linkedin.set3;

public class Program54_UncheckedException {
	public static void main(String[] args) {

		int[] number= {1,4,6,7,9,4,9,4};
		
		try {
			System.out.println("The unchecked exception ==> "+ number[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound exception ==> "+ e.getMessage());
		}
	}
}
