package com.exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckExcpetion {

	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner in = new Scanner(new File("abc.txt"));
	}
}
