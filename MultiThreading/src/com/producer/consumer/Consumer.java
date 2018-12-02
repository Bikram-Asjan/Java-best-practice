package com.producer.consumer;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{
	private BlockingQueue<Integer> synchronizationQueue;

	public Consumer(BlockingQueue<Integer> synchronizationQueue) {
		super("Consumer");
		this.synchronizationQueue = synchronizationQueue;
	}

	@Override
	public void run() {
		try{
			while(true){
				Integer item = synchronizationQueue.take();
				System.out.println(getName()+ " consumed "+item);
			}
		} catch (InterruptedException ex){
			ex.printStackTrace();
		}
	}
	
	

}
