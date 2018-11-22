package com.exceptionHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * child followed by parent
 * 
 * @author hp
 *
 */
public class ExceptionDemo4MultiCatch {

	public static void main(String[] args){
		
		try{
			Scanner in = new Scanner(new File("abc.txt"));
		}catch(IOException e){
			
		}
		/*catch(IOException e){
			
		}*/
		catch(RuntimeException e){
			
		}catch(Exception e){
			
		}
		finally{
			System.out.println("finally block");
		}
		
		/**
		 * try finally without catch - valid
		 */
		try{
			// risky code here
		}
		finally{
			
		}
		
	}
}
