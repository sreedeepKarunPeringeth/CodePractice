package com.coreJava;


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

public class CoreJavaConcepts {

	public static void main(String[] args) {
		
		nextChild nc = new nextChild();
		
		nc.onlyMine();
		
		Parent p = new Child();
		//Child c = (Child) new Parent();
		Child c = new Child();
		Parent p1 = null;
		
		p1.method3();  // prints the static method of Parent
		//p1.method1();  //  null pointer exception
		
		p.method1();  // prints child method1 
		p.method3();  // prints static method of Parent  because declared type of p is Parent
		//p.method2();  // can't do this as it is private method  
		
		c.method1();   // prints child method1
		c.method3();   // prints static method of Child because declared type of c is Child
	}

}
