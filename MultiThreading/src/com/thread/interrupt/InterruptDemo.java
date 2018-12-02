package com.thread.interrupt;

public class InterruptDemo extends Thread {
	
	@Override
	public void run() {
		try {
			for(int i = 1; i<=100000; i++){
				System.out.println("i am Lazy thread "+i);
				
					Thread.sleep(2000);
				
			}
			
		} catch (InterruptedException e) {
			System.out.println("I got interrupted");
		}
	}
	
	
}
