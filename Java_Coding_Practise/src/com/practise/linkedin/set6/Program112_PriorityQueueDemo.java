package com.practise.linkedin.set6;

import java.util.PriorityQueue;

public class Program112_PriorityQueueDemo {
	public static void main(String[] args) {

		PriorityQueue<Integer> queue=new PriorityQueue<>();
		queue.add(49);
		queue.add(12);
		queue.add(86);
		
		System.out.println(queue);
		
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		System.out.println(queue);
	}
}
