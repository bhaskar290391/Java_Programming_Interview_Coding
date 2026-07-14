package com.practise.linkedin.set3;

import java.util.Objects;

public class Program60_RequireNonNullElseGet {
	public static void main(String[] args) {

		String name = null;
		String defaultName = "java";

		String languageName = Objects.requireNonNullElseGet(name, () -> defaultName);

		System.out.println("The language name " + languageName);
	}
}
