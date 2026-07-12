package com.practise.linkedin.set7;

import java.util.Arrays;
import java.util.List;

public class Program132_ListContainsMethod {
	public static void main(String[] args) {
		
		List<String> languageList=Arrays.asList("Java","C++","Microservice");
		
		System.out.println("Java is present or not : "+ languageList.contains("Java"));
	}
}
