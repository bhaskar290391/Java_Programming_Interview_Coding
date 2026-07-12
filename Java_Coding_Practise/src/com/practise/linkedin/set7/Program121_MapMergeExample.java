package com.practise.linkedin.set7;

import java.util.HashMap;
import java.util.Map;

public class Program121_MapMergeExample {
	public static void main(String[] args) {

		Map<String, Integer> data=new HashMap<>();
		data.put("Anish", 20);
		data.put("Kranti", 8);
		
		data.merge("Anish",5 , Integer::sum);
		data.merge("Lalit",35 , Integer::sum);
		
		System.out.println(data);
	}
}
