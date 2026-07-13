package com.practise.linkedin.set4;

import java.util.concurrent.CopyOnWriteArrayList;

public class Program67_CopyOnWriteArralyList {
	public static void main(String[] args) {

		CopyOnWriteArrayList<String> data = new CopyOnWriteArrayList<>();
		data.add("Java");
		data.add("Docker");
		data.add("Microservice");

		for (String language : data) {

			System.out.println("The current technology :" + language);

			if (language.equals("Java")) {
				data.add("Kubernetes");
				System.out.println("Kubernetes is added");
			}

			
		}
		System.out.println("The final technology is " + data);

	}
}
