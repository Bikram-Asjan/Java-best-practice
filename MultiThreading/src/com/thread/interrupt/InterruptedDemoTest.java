package com.thread.interrupt;

public class InterruptedDemoTest {

	public static void main(String[] args) {
		InterruptDemo t = new InterruptDemo();

		t.start();
		t.interrupt();
	}

}
