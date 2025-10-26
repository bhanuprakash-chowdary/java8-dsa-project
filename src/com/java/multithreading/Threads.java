package com.java.multithreading;

public class Threads {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread = new MyThread();
		thread.start();
		thread.join();
		System.out.println("Thread has finished.");
	}
}

class MyThread extends Thread {
	public void run() {
		System.out.println("Thread is running...");
	}
}
