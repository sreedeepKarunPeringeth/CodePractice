package com.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/**
 * 
 * This program prints the linked list in reverse order without loop
 * 
 * @author Sree
 *
 */
public class ReverseLinkedList {

	private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void main(String[] args) {

		List ll = new LinkedList();
		ll.add("1");
		ll.add("2");
		ll.add("2");
		ll.add("3");
		ll.add("4");
		reverseList(ll,ll.size()-1);
	}

	static void reverseList(List ll, int size){

		System.out.print(ll.get(size));
		//logger.info(ll.get(size) +" ");
		
		if(size > 0)
			reverseList(ll, size-1);
	
	}
}
