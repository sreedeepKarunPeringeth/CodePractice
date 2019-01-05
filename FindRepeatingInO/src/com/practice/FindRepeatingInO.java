package com.practice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * 
 * This program finds the repeating digits from a given String in one iteration.
 * 
 * @author Sree
 *
 */
public class FindRepeatingInO {

	private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		logger.info("Enter a String");
		
		String input = in.next();
		in.close();
		String[] value = input.split("");
		String result1= "";
		//String result2= "";
		//Map hm = new HashMap();
		Hashtable ht = new Hashtable();
		for(int i= 0;i< value.length;i++){
			
			if(null != ht.put(value[i], new Integer(1))){
				result1+= value[i];
			}
			
			/*if(null != hm.put(value[i], new Integer(1))){
				result2+= value[i];
			}*/
		}
		logger.info(result1);
		//logger.info(result2);
	}

}
