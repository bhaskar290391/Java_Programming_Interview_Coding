package com.practise.linkedin.set3;

import java.util.Arrays;

public class Program59_EnumExample {

	public enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}

	public static void main(String[] args) {

		Arrays.stream(Day.values()).forEach(day -> System.out.println(day));
	}
}
