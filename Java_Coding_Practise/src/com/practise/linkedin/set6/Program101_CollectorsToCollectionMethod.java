package com.practise.linkedin.set6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Program101_CollectorsToCollectionMethod {
	public static void main(String[] args) {

		List<String> data = Arrays.asList("samir", "sahil", "Kishore", "Diva");

		LinkedList<String> collect = data.stream().filter(name -> name.startsWith("s"))
				.collect(Collectors.toCollection(LinkedList::new));

		System.out.println("collect ==>" + collect);
	}
}
