package com.practise.linkedin.set6;

import java.util.EnumSet;

enum DayOfWeek {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class Program110_EnumSetExample {
	public static void main(String[] args) {
		
		EnumSet<DayOfWeek> range = EnumSet.range(DayOfWeek.MONDAY, DayOfWeek.FRIDAY);
		System.out.println("Working Days" +range);
	}
}
