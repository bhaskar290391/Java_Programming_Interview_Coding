package com.practise.linkedin.set3;

import java.util.ArrayList;
import java.util.List;

public class Program56_AutoBoxing {
	public static void main(String[] args) {

		List<Integer> employeeList= new ArrayList<>();
		employeeList.add(1990);
		employeeList.add(1675);
		employeeList.add(98);
		
		for (Integer employee : employeeList) {
			System.out.println("The employee id is "+ employee);
		}
		
	}
}
