package com.practise.linkedin.set1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program5_TryWithResourcesExample {
	public static void main(String[] args) {

		try (FileReader reader = new FileReader("Notes.txt"); BufferedReader br = new BufferedReader(reader)) {

			String text;

			while ((text = br.readLine()) != null) {
				System.out.println(text);

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
