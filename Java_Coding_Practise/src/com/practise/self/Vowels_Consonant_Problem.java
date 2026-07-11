package com.practise.self;

public class Vowels_Consonant_Problem {
	public static void main(String[] args) {
		int k = 2;
		String vowels = "aeiou";
		String str = "bangalore";
		// output= bingilaro

		StringBuffer datas = new StringBuffer();

		for (char data : str.toCharArray()) {

			if (vowels.indexOf(data) != -1) {

				int index = (vowels.indexOf(data) + k) % vowels.length();

				datas.append(vowels.charAt(index));

			} else {
				datas.append(data);
			}

		}
		System.out.println("The data is " + datas);
	}
}
