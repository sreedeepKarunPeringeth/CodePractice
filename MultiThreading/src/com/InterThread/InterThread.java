package com.InterThread;


/**
 * 
 * wait(), notify(), and notifyAll() are in object class. Bz thread will call wait on 
 * different objects
 * 
 * for calling wait() on any object, the thread should be having the lock of that object
 * 
 * IllegalMonitorStateException - if a thread calls wait() on someother's object
 *  - same exception if we try to call from non-synchronized area
 * 
 * 
 * Thread releases lock of the objects on wait(), notify(), and notifyAll() - no other methods
 * where thread releases the lock
 * 
 * wait() - releases locks immediately on that object and enters into waiting state. 
 * notify() and notifyAll() - releases locks slowly
 * 
 * 
 * 
 * Every wait() throws InterruptedException
 * 
 * 
 * diff between notify() and notifyAll()
 * 
 * @author sreperin
 *
 */

class Processor extends Thread{
	
	private int total= 0;
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void run(){
		
		synchronized(this){
			for(int i= 0;i <= 100;i++){
				total= total+i;
			}
			this.notify();
		}
	}
}

/*class proc extends Processor{
	
	public static void method1(){
		System.out.println("in child");
	}
	
	public void run(){
		System.out.println("in child");
	}
}*/

public class InterThread {

	public static void main(String[] args) throws InterruptedException{
		
		Processor p = new Processor();
		
		p.start();
		//Thread.sleep(2000);
		synchronized (p) {
			p.wait();
		}
		//p.join();
		System.out.println(p.getTotal());
			
	}
}
