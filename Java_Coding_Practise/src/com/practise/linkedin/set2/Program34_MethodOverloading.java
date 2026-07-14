package com.practise.linkedin.set2;

public class Program34_MethodOverloading {

	public int add(int first, int second) {
		return first + second;
	}

	public String add(String first, String second) {
		return first + second;
	}

	public int add(int first, int second, int third) {
		return first + second + third;
	}

	public static void main(String[] args) {
		Program34_MethodOverloading data = new Program34_MethodOverloading();
		System.out.println(data.add(10, 29));
		System.out.println(data.add("Bhaskar", "Mudaliyar"));
		System.out.println(data.add(10, 10, 40));
		
	}
}
