package com.practise.linkedin.set4;

class StaticVariableCounter {

	public static int count = 0;

	public StaticVariableCounter() {
		count++;
	}

	public void display() {
		System.out.println("The value of counter is " + count);
	}

}

public class Program69_StaticVariableCounter {
	public static void main(String[] args) {

		StaticVariableCounter first = new StaticVariableCounter();
		StaticVariableCounter second = new StaticVariableCounter();
		StaticVariableCounter third = new StaticVariableCounter();

		first.display();
		second.display();
		third.display();

	}
}
