package com.exceptionHandling;

public class ExceptionDemo2 {

	public static void main(String[] args){
		
		try{
			//int i = 10/0;
			System.out.println("first");
			int i = 10/0;
			System.out.println("second");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e);
			e.printStackTrace();
			//int i = 10/0;
			System.out.println("third");
		}
		System.out.println("fourth");
	}
}
