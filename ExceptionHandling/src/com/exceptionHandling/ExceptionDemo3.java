package com.exceptionHandling;

public class ExceptionDemo3 extends Throwable{

	public static ArithmeticException e1 /*= new ArithmeticException()*/;
	public static ArithmeticException e /*= new ArithmeticException()*/;
	
	
	/*
	 * ----- no need of throws keyword for main() --------
	 * ------- Error() is unchecked ---------
	 * 
	 * 
	 * public static void main(String[] args){
		throw new Error();
	}*/
	
	/**
	 * 
	 * ---------- must be caught or declared to be thrown as it could contain checked exception
	 * 
	 * @param args
	 * @throws ExceptionDemo3
	 */
	public static void main(String[] args) throws ExceptionDemo3 {
		
		String s= new String("sree");
		Object o= s;
		//int i= (int) o;
		
		//throw e1;
		//throw e;
		//throw  new Error();
		
		// either thrown  or caught like below
		//throw new ExceptionDemo3();
		
		
		
		try {
			throw new ExceptionDemo3();
		} catch (ExceptionDemo3 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("finished");*/
			//int i = 10/0;
			//System.out.println("first");
			//int i = 10/0;
		//	System.out.println("second");
		//	System.out.println("third");
	}
}
