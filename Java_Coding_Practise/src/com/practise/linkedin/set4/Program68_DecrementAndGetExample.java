package com.practise.linkedin.set4;

import java.util.concurrent.atomic.AtomicInteger;

public class Program68_DecrementAndGetExample {
	public static void main(String[] args) {

		AtomicInteger counter = new AtomicInteger(10);

		Thread first = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("The value of counter decremented by thread 1 " + counter.decrementAndGet());
			}
		});

		Thread second = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("The value of counter decremented by thread 2 " + counter.decrementAndGet());
			}
		});

		first.start();
		second.start();

		try {
			first.join();
			second.join();
		} catch (InterruptedException e) {
			System.out.println("Thread is interrupted");
		}

		System.out.println("The final value of counter ==> " + counter.get());
	}
}
