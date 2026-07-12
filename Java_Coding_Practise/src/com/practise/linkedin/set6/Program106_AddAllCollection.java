package com.practise.linkedin.set6;

import java.util.ArrayList;
import java.util.List;

public class Program106_AddAllCollection {
	public static void main(String[] args) {

		List<String> existingStudList = new ArrayList<>();
		existingStudList.add("Bhaskar");
		existingStudList.add("Maddy");

		List<String> newStudList = new ArrayList<>();
		newStudList.add("kanishk");
		newStudList.add("sammy");

		existingStudList.addAll(newStudList);

		System.out.println("Updated the student list " + existingStudList);
	}
}
