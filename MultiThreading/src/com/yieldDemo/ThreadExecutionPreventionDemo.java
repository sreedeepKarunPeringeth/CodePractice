package com.yieldDemo;

class MyThread extends Thread{
	
	static Thread mainThread;
	public void run(){
		for(int i= 0; i < 5; i++){
			try {
				mainThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child thread");
			//MyThread.dumpStack();
			//Thread.yield();
		}
	}
}

public class ThreadExecutionPreventionDemo {

	public static void main(String[] args) throws InterruptedException{
		MyThread t = new MyThread();
		MyThread.mainThread  = Thread.currentThread();
		t.wait();
		t.start();
		t.join(5000);
		Thread.sleep(2000);
		for(int i= 0; i < 5; i++){
			System.out.println("main thread");
			
		}
	}
}
