package com.practise.linkedin.set7;

import java.util.PriorityQueue;

public class Program136_PriorityQueueExample {
	public static void main(String[] args) {

		PriorityQueue<Integer> data = new PriorityQueue<>();
		data.add(30);
		data.add(11);
		data.add(50);
		data.add(21);

		System.out.println("The priority data " + data);

		while (!data.isEmpty()) {

			System.out.println(data.poll());

		}
		
		System.out.println("The priority data after polling" + data);
	}
}
