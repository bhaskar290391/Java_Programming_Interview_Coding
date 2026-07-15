package com.interview.question.epam;

public class Sum_Of_Array_Based_k {

	public static void main(String[] args) {
		
		
		int number []= {1,2,3,4,5};
		int k=3;
		
		
		int newArray[]=new int[number.length];
		
		for (int i = 0; i < number.length; i++) {
			int currrentSum=0;
			if(i<k) {
				currrentSum +=number[i];
			}else {
				for (int j = i; j > i-k; j--) {
					currrentSum +=number[j];
				}
			}
			
			newArray[i]=currrentSum;
		}
		
		for (int i : newArray) {
			System.out.println(i);
		}
		
	}
}
