package com.java.multithreading;

import java.sql.Timestamp;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class ThreadState {

	public static void main(String[] args) {
		
		
		ExecutorService pool=Executors.newScheduledThreadPool(10);
		
		Test t=new Test();
		
		int execute=9000000;
		while(execute>=0) {
			pool.execute(()->t.testMethod(1));
			execute--;
		}
		
		
		
		
//		System.out.println(new Timestamp(System.currentTimeMillis()));
//		Test t=new Test();
//		new Thread() {
//			public void run() {
//				t.testMethod(10);
//			};
//		}.start();
//		
//		new Thread() {
//			public void run() {
//				t.testMethod(100);
//				
//			};
//		}.start();
//		System.out.println(new Timestamp(System.currentTimeMillis()));
	}
}

class Test{
	
	synchronized void testMethod(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(i*n);
		}
	}
}



class Thread1 extends Thread{
	
	Test t1;
	public Thread1(Test t) {
		t1=t;
	}
	
	@Override
	public void run() {
		t1.testMethod(5);
	}
}

class Thread2 extends Thread{
	
	Test t1;
	public Thread2(Test t) {
		t1=t;
	}
	
	@Override
	public void run() {
		t1.testMethod(100);
	}
}