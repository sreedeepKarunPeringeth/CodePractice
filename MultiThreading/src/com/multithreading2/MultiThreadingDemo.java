package com.multithreading2;

class Processor implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("inside run()  ="+ Thread.currentThread());
	}
	
}

public class MultiThreadingDemo {

	public static void main(String[] args){
	
		Thread t1 = new Thread(new Processor());
		t1.start();
		
		System.out.println(Thread.currentThread());
	}
}
