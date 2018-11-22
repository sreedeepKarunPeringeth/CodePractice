package com.exceptionHandling;


class MyException extends RuntimeException{
	
	
	MyException(String name){
		super(name);
	}

	
}

public class CustomizedException {

	public static void main(String[] args){

		System.out.println("before throwing myException");
		throw new MyException("sree");
		
	}
}
