package com.practise.linkedin.set2;

class SynchronizedDemo {

	private int count = 0;

	public synchronized void counter() {
		count++;
		System.out.println("The counter is "+ count);
	}
}

public class Program35_SynchronizedExample {
	public static void main(String[] args) {
		
		SynchronizedDemo demo = new SynchronizedDemo();
		
		Thread t1= new Thread(()-> {
			for (int i = 0; i < 5; i++) {
				demo.counter();
			}
		});
		
		Thread t2= new Thread(()-> {
			for (int i = 0; i < 5; i++) {
				demo.counter();
			}
		});
		
		t1.start();
		
		t2.start();
		
	}
}
