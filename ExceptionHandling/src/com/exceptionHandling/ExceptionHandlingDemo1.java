package com.exceptionHandling;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) throws Exception{
		doStuff();
	}
	public static void doStuff() {
		doMoreStuff();
	}
	public static void doMoreStuff()  {
		try{
		int i = 10/0;
		}catch(Exception e){
			
		}
	}
}
