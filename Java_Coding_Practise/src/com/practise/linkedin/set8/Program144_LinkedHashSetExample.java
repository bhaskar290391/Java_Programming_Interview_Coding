package com.practise.linkedin.set8;

import java.util.LinkedHashSet;

public class Program144_LinkedHashSetExample {
	public static void main(String[] args) {

		LinkedHashSet<String> data = new LinkedHashSet<>();
		data.add("Java");
		data.add("Microservice");
		data.add("Docker");
		data.add("Java");
		data.add("Kubernetes");
		System.out.println("The Elements ===>");
		System.out.println(data);
	}
}
