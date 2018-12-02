package com.mt.synchronization.objectlevel.lock;

public class Display {
	public synchronized void wish(String name){
		for(int i=0;i<10;i++){
			System.out.println("Good morning   "+name);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				
			}
		}
	}
}
