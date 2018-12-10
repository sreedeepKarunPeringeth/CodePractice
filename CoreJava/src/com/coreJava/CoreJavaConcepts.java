package com.coreJava;

import java.util.Iterator;
import java.util.TreeMap;

class Parent {
	
	public static void onlyMine(){
		System.out.println("in parent static method: onlyMine()");
	}
	
	private String parentName;
	
	public void method1(){
		System.out.println("method1- parent");
	}
	
	private void method2(){
		System.out.println("method2- parent");
	}
	
	private void method2(String overload){
		System.out.println("method2- overloading parent");
	}
	
	public static void method3(){
		System.out.println("method3- parent");
	}
	
	public static void method3(String overload){
		System.out.println("method3- overloading - parent");
	}
	
	final void method4(){
		System.out.println("method4 - parent");
	}
	final void method4(String overload){
		System.out.println("method4- overloading - parent");
	}
}

 class Child extends Parent{
	
	private String childName;
	
	public void method1(){
		System.out.println("method1- child");
	}
	
	private void method2(){
		System.out.println("method2- child");
	}
	
	public static void method3(){
		System.out.println("method3- child");
	}
	
	/*
	 *  final methods can't be overriden
	 * 
	 final void method4(){
		System.out.println("method4- child");
	}*/
}


class nextChild extends Child{
	
}

interface homeTest{
	public void homeTestRun();
}

interface test extends homeTest{
	
	public void testRun();
	default void testDefault() {
		System.out.println("inside testDefault() ");
	}
}

class fibonacci 
{ 
    static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    } 
       
    public static void main (String args[]) 
    { 
    int n = 9; 
    System.out.println(fib(n)); 
    } 
} 

public class CoreJavaConcepts implements test{

	
	@Override
	public void testRun() {
		System.out.println("inside implemented class");
		
	}
	
	static void sort(int[] arr){
		arr[2]= 0;
	}
	
	public static void main(String[] args) {
		
		
		int[] arr = new int[]{5,2,1};
		
		System.out.println("array bfr: " +arr[2]);
		
		sort(arr);
		
		System.out.println("array aftr: " +arr[2]);
		
		TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
		
		tm.put(1, 1);
		tm.put(2, 2);
		tm.put(4, 4);
		tm.put(3, 3);
		
		tm.put(5, 5);
		
		Iterator it = tm.navigableKeySet().iterator();
		System.out.println(it.next());
		
		CoreJavaConcepts core = new CoreJavaConcepts();
		core.testDefault();
		//test.testDefault();
		
//		nextChild nc = new nextChild();
//		
//		nc.onlyMine();
//		
//		Parent p = new Child();
//		//Child c = (Child) new Parent();
//		Child c = new Child();
//		Parent p1 = null;
//		
//		p1.method3();  // prints the static method of Parent
//		//p1.method1();  //  null pointer exception
//		
//		p.method1();  // prints child method1 
//		p.method3();  // prints static method of Parent  because declared type of p is Parent
//		//p.method2();  // can't do this as it is private method  
//		
//		c.method1();   // prints child method1
//		c.method3();   // prints static method of Child because declared type of c is Child
	}

	@Override
	public void homeTestRun() {
		// TODO Auto-generated method stub
		
	}

	

}
