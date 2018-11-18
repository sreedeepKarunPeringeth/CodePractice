package com.multithreading3;

public class MultiThreadingDemo {

	public static void main(String[] args){
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("inside run() 3");
			}
		});
		t1.start();
	}
}
