package com.practice;

import java.util.Scanner;

/**
 * 
 * This program illustrates the use of dynamic programming to make the normal 
 * recurssive algo for finding nth fibonacci more efficient
 * 
 * @author Sree
 * 
 *
 */
public class Fibonacci {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n for nth fibonacci number");
		int n = in.nextInt();
		long l = System.currentTimeMillis();
		int[] arr = new int[n+1];
		//System.out.println(findFibRecDyn(n,arr));
		System.out.println(findFibRec(n,arr));
		System.out.println("Time take " + ( System.currentTimeMillis() - l) );
		
	}
	
	public static int findFibRec(int n, int[] arr){
		if(arr[n] != 0)
			return arr[n];
		if(n == 1 || n == 2)
			return 1;
		arr[n] = findFibRec(n-1,arr) + findFibRec(n-2,arr);
		
		return arr[n];
	}
	
	// We use dynamic programming in this method to make it more efficient
	
	public static int findFibRecDyn(int n, int[] arr){
		if(arr[n] != 0)
			return arr[n];
		if(n == 1 || n == 2)
			return 1;
		arr[n] = findFibRecDyn(n-1,arr) + findFibRecDyn(n-2,arr);
		
		return arr[n];
	}
}
