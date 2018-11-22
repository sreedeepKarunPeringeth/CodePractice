package com.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EnhancementsInException {

	public static void main(String[] args) {
		
		
		// try with resources
		try(BufferedReader br= new BufferedReader(new FileReader("abc.txt"));
				BufferedReader br1= new BufferedReader(new FileReader("abc.txt"))){
			
			//br = new BufferedReader(new FileReader("abc.txt"));  -- cannot be reassigned. become final
		}
		catch(IOException e){
			
		}
		
		// multi-catch block
		
		try{
			
			System.out.println(10/0);
		}
		catch(NullPointerException | ArithmeticException e){
			throw new ClassCastException(); // rethrowing the exception
		}
	}
}
