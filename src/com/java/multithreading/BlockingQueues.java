package com.java.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueues {

	private BlockingQueue<String> queue=new LinkedBlockingQueue<>();
	
	int iterator=1;
	
	public void consumer(String thread) {

		int i = 1;
		while (i<=3) {
			try {
 				queue.put( thread+" iterator " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
		iterator++;
	}
	
	
	
	
	
	public void produce() {

		new Thread() {

			@Override
			public void run() {
				while (true) {
					try {
						System.out.println(queue.take());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
	
	
	public static void main(String[] args) {
		BlockingQueues queue=new BlockingQueues();
		queue.produce();
		int i = 1;
		while (i<=100) {
			queue.consumer("Thread "+i );
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
