package com.practise.linkedin;

class SingleTon {
	private static SingleTon instance;

	private SingleTon() {
		System.out.println("Private Constructor");
	}

	public static SingleTon getInstance() {
		if (instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}

}

public class Program19_SingletonExample {
	public static void main(String[] args) {

		SingleTon data1 = SingleTon.getInstance();
		SingleTon data2 = SingleTon.getInstance();

		System.out.println("Check the object is equal or not : " + (data1 == data2));
	}
}
