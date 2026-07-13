package com.practise.linkedin.set5;

import java.util.concurrent.CompletableFuture;

public class Program98_CompletableFutureExample {
	public static void main(String[] args) {

		int number =3;
		
		CompletableFuture.supplyAsync( ()->{
			return number * number;
		}).thenAccept(result -> System.out.println("The result==>"+ result));
	}
}
