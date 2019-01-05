package com.practice;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * 
 * 
 * This program prints the name "Sreedeep" for N times without using loop. Here N is the input
 * 
 * Recursion is used here
 * @author Sree
 *
 */
public class PrintNTimesWithoutLoop {

	private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while(true){
			logger.info("Enter the count ( -1 for exit)");
			int count = in.nextInt();
			if(count == -1)
				System.exit(0);
			printName(count);
		}
		
	}
	
	static void printName(int count){
		
		
		if(count > 1)
			printName(count-1);
		logger.info("Sreedeep "+ count);
		
	}

}
