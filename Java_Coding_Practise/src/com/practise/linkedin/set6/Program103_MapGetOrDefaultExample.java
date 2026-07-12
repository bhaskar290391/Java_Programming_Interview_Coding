package com.practise.linkedin.set6;

import java.util.HashMap;
import java.util.Map;

public class Program103_MapGetOrDefaultExample {
	public static void main(String[] args) {
		
		Map<String, Integer> product =new HashMap<>();
		product.put("laptop", 20);
		product.put("monitor", 10);
		product.put("keyboard", 5);
		
		System.out.println(product);
		
		int monitorQuantity=product.getOrDefault("monitor", 0);
		int mouseQunatity=product.getOrDefault("mouse", 0);
		
		System.out.println("The mouse qunatity "+ mouseQunatity);
		System.out.println("The monitor qunatity "+ monitorQuantity);
	}
}
