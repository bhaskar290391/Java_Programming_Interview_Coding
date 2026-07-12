package com.practise.linkedin.set7;

import java.util.Optional;

public class Program122_OptionalIfPresent {
	public static void main(String[] args) {
		
		Optional<String> data= getUserEmail(201);
		
		data.ifPresent(value -> System.out.println("The value is "+ value));
		
	}
	
	public static Optional<String> getUserEmail(int userId){
		
		if(userId ==201) {
			return Optional.ofNullable("Bhaskar@gmail.com");
		}else {
			return Optional.empty();
		}
	}
}
