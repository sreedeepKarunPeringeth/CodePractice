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
	}
	
}
