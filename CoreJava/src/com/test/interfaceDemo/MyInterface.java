package com.test.interfaceDemo;

public interface MyInterface {

	final int count= 10;
	
	int defCount = 5;
	
	int constant = 6;
	
	public default void print(){
		System.out.println("print in default method");
	}
	
	public static void print1(){
		System.out.println("print in final method");
	}
	
	public void print2();
}
