package com.practise.linkedin.set4;

public class Program64_SwitchStringDemo {
	public static void main(String[] args) {

		String day = "Wednesday";

		switch (day.toLowerCase()) {

		case "saturday":
		case "sunday":
			System.out.println(day + " today is weekend");
			break;
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":

		case "friday":
			System.out.println(day + "==> is a weekdays");
			break;

		default:
			System.out.println("Invalid day");
			break;
		}
	}
}
