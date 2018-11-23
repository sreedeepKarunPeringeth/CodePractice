package com.multithreading1;

import java.util.Scanner;

class Processor extends Thread{
	
	private volatile boolean flag = true;
	
	public void start(){
		System.out.println("in overwritten");
		super.start();
	}
	
	public void run(){
		super.run();
	/*	while(flag){
			System.out.println("inside run()");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean value) {
		this.flag = value;
	}
}


public class MultiThreadingDemo1 {

	public static void main(String[] args){
		
		Processor p1  = new Processor();
		p1.start();
		p1.start();
		System.out.println("Type something to stop");
		Scanner sc = new Scanner(System.in);
		//sc.nextLine();
		//p1.setFlag(false);
	}
}
