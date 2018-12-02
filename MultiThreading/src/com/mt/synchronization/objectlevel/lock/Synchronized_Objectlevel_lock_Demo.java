package com.mt.synchronization.objectlevel.lock;

public class Synchronized_Objectlevel_lock_Demo {

	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread t1 = new MyThread(d1, "Anu");
		MyThread t2 = new MyThread(d2, "Arpita");
		t1.start();
		t2.start();
		
	}

}
