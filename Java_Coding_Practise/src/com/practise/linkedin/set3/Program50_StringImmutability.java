package com.practise.linkedin.set3;

public class Program50_StringImmutability {
	public static void main(String[] args) {

		String data = "Bhaskar , Mudaliyar";
		String unmodifiedData = data.replace(" , ", " ");
		System.out.println(data);
		System.out.println(unmodifiedData);
	}
}
