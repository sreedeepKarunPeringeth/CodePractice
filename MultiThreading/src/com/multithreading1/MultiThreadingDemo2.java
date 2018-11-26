package com.multithreading1;

public class MultiThreadingDemo2 {

	public static void main(String[] args){
		
		try{
			
			return; // finally block will be executed
			//System.exit(0); // finally block won't be executed
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("in finally block");
		}
		
		System.out.println("after");
		
		int x= 9;
		if( x == 9){
			x= 8;
		}
		
	}
	
}
