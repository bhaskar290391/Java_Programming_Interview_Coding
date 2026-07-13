package com.practise.linkedin.set4;

public class Program80_EqualIgnoreCaseOfString {
	public static void main(String[] args) {

		String data="BHASKAR";
		String data1="Bhaskar";
		
		if(data.equalsIgnoreCase(data1)) {
			System.out.println("Input matched !!!");
		}else {
			System.out.println("Input Not Matched !!!");
		}
	}
}
