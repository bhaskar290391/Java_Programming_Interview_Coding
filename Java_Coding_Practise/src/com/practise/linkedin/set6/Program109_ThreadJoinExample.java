package com.practise.linkedin.set6;

class Task extends Thread {

	private String name;

	public Task(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " is started !!");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + " is Completed !!");
	}
}

public class Program109_ThreadJoinExample {
	public static void main(String[] args) {

		Task task1 = new Task("Task 1");
		Task task2 = new Task("Task 2");

		task1.start();
		task2.start();

		try {
			task2.join();
			task1.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("All thread completed the task");
	}

}
