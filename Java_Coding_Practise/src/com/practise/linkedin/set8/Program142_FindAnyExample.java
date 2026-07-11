package com.practise.linkedin.set8;

import java.util.List;

public class Program142_FindAnyExample {
	public static void main(String[] args) {

		List<String> data= List.of("Shradha","Vignesh","Prachi");
		
		String namelist=data.stream().filter( name -> name.startsWith("P")).findAny().orElse("No Found");
	
		System.out.println(namelist);
	}
}
