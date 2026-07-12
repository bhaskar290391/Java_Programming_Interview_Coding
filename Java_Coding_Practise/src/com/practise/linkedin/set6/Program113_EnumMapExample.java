package com.practise.linkedin.set6;

import java.util.EnumMap;

enum Role {
	DEVELOPER, TESTER, DESIGNER, MANAGER;
}

public class Program113_EnumMapExample {
	public static void main(String[] args) {

		EnumMap<Role, String> data = new EnumMap<>(Role.class);

		data.put(Role.DEVELOPER, "Developer");
		data.put(Role.DESIGNER, "Web designer");
		data.put(Role.MANAGER, "Management");
		data.put(Role.TESTER, "QA");

		System.out.println("The enum Map ==>" + data);

		for (Role role : Role.values()) {
			System.out.println("The role is " + role + " => The value is " + data.get(role));
		}
	}
}
