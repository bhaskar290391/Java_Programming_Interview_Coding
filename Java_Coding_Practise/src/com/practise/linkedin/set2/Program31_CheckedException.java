package com.practise.linkedin.set2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program31_CheckedException {

	public static void main(String[] args) {

		try {
			
			FileReader reader=new FileReader("bhaskar.txt");
			BufferedReader br=new BufferedReader(reader);
			
			String line;
			
			while ((line=br.readLine())!= null) {
				System.out.println(line);
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		}
	}
}
