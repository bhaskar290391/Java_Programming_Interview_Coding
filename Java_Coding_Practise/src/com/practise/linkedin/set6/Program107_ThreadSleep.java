package com.practise.linkedin.set6;

public class Program107_ThreadSleep {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("The counter " + i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
