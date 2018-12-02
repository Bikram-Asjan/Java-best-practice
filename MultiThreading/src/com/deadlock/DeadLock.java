package com.deadlock;


public class DeadLock {

	public static void main(String[] args) {
		final String resource1 = "Asoke";
		final String resource2 = "Jayanti";
		// Thread t1 tries to lock resource 1, then resource 2
		Thread t1 = new Thread() {
			public void run() {
				
				synchronized (resource1) {
					System.out.println("Thread t1 lock resource 1");
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){}
					synchronized(resource2){
						System.out.println("THread t1 lock resource 2");
					}
				}
			}
		};
		// Thread t2 tries to lock resource 2, then resource 1
		Thread t2 = new Thread(){
			public void run(){
				synchronized(resource2){
					System.out.println("Thread t2 locked resource 2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e){}
					synchronized(resource1){
						System.out.println("Thread t2 locked resource 1");
					}
				}
			}
			
		};
		t1.start();
		t2.start();
	}

}
/**
 * output:
 * Thread t1 lock resource 1
   Thread t2 locked resource 2
 */
  

