package com.practise.linkedin;

sealed abstract class Shapes permits Triangles, Circles {
	public abstract void display();
}

final class Triangles extends Shapes {

	@Override
	public void display() {
		System.out.println("Triangle display method");
	}

}

final class Circles extends Shapes {

	@Override
	public void display() {
		System.out.println("Cricles display method");
	}

}

public class Program9_SealedClassExample {
	public static void main(String[] args) {

		Triangles t = new Triangles();
		t.display();

	}
}
