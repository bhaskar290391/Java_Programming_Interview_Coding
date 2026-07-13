package com.practise.linkedin.set4;

import java.util.concurrent.atomic.AtomicInteger;

public class Program65_AtomicIntegerwithMultithreading {
	public static void main(String[] args) {

		AtomicInteger counter = new AtomicInteger(0);

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.incrementAndGet();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.incrementAndGet();
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("The counter ==> " + counter);
	}
}
