package com.test.interfaceDemo;

public class InterfaceDemo implements MyInterface{

	static int value = 8;
	
	public InterfaceDemo(String arg){
		value = 89;
	}
	
	public InterfaceDemo() {
		// TODO Auto-generated constructor stub
		value = 55;
	}

	/*public void print() {
		// TODO Auto-generated method stub
		System.out.println("print in impl for default");
	}
	
	public static void print1(){
		System.out.println("print in impl for final");
	}*/
	
	@Override
	public void print2() {
		// TODO Auto-generated method stub
		System.out.println("print2 in impl for abstract method");
	}
	
	public static void main(String[] args){
		
		//value = 80;
		
		InterfaceDemo id = new InterfaceDemo();
		InterfaceDemo id2 = new InterfaceDemo("hello");
		
		InterfaceDemo2 demo2 = new InterfaceDemo2();
		//demo2.print1();
		demo2.print();
		System.out.println("demo2 count: " + demo2.count);
		
		System.out.println(id.value);
		System.out.println(id2.value);
		
		id.print();
		//id.print1();
		MyInterface.print1();
		id.print2();
		//MyInterface.count = 2;
		//id.constant = 0;
		System.out.println(id.count);
		System.out.println(id.constant);
		System.out.println(id.defCount);
		
		// Accessing directly without object
		System.out.println(MyInterface.count);
		System.out.println(MyInterface.constant);
		System.out.println(MyInterface.defCount);
		
		//demo2.print1();
		
		//id.count= 10;
	}

	
}




