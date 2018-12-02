package com.producer.consumer;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
	private BlockingQueue<Integer> synchronizationQueue;
	
	public Producer(BlockingQueue<Integer> synchronizationQueue) {
		super("PRODUCER");
		this.synchronizationQueue = synchronizationQueue;
	}

	@Override
	public void run() {
		// no synchronization needed
		for(int i = 0; i < 10; i++){
			try{
				System.out.println(getName() +" produced " + i);
				synchronizationQueue.put(i);
				//Thread.sleep(200);
			} catch (InterruptedException ex){
				ex.printStackTrace();
			}
		}
	}

}