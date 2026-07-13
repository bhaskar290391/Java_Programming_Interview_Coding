package com.practise.linkedin.set4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program66_IteratorDemoExample {
	public static void main(String[] args) {

		List<Integer> data = new ArrayList<>();
		data.add(29);
		data.add(45);
		data.add(78);

		Iterator<Integer> iterator = data.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
