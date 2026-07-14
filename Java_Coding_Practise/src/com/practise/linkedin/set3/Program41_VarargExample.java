package com.practise.linkedin.set3;

public class Program41_VarargExample {
	public static void main(String[] args) {
		int firstSum = add(2, 3);
		int secondSum = add(2, 3, 4);
		int thirdSum = add();

		System.out.println("FirstSum " + firstSum);
		System.out.println("secondSum " + secondSum);
	}

	private static int add(int... number) {
		int sum = 0;

		for (int i : number) {
			sum += i;
		}
		return sum;
	}

}
