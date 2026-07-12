package com.practise.linkedin.set6;

public class Program111_ThreadLocalDemo {
	public static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

	public static void main(String[] args) {

		Runnable run = () -> {
			int count = threadLocal.get();
			count++;
			threadLocal.set(count);

			System.out.println("The thread is " + Thread.currentThread().getName() + " ==> Thread counter value "
					+ threadLocal.get());
		};

		Thread t1 = new Thread(run, "Thread 1");
		Thread t2 = new Thread(run, "Thread 2");

		t1.start();
		t2.start();
	}
}
