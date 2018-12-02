package com.producer.consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerSolution {

	public static void main(String[] args) {
		BlockingQueue<Integer> synchronizationQueue = new LinkedBlockingQueue<>();
		Producer p = new Producer(synchronizationQueue);
		Consumer c = new Consumer(synchronizationQueue);
		
		p.start();
		c.start();
	}

}
