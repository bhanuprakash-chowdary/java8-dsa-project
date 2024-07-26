package com.java.practice;

public class ThreadState {

	public static void main(String[] args) {
		
		Test t=new Test();
		new Thread() {
			public void run() {
				t.testMethod(5);
			};
		}.start();
		
		new Thread() {
			public void run() {


				t.testMethod(500);
				
			};
		}.start();
	}

}

class Test{
	
	synchronized void testMethod(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(i*n);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

//
//
//class Thread1 extends Thread{
//	
//	
//	
//	Test t1;
//	public Thread1(Test t) {
//		t1=t;
//	}
//	
//	@Override
//	public void run() {
//		t1.testMethod(5);
//	}
//}
//
//class Thread2 extends Thread{
//	
//	Test t1;
//	public Thread2(Test t) {
//		t1=t;
//	}
//	
//	@Override
//	public void run() {
//		t1.testMethod(100);
//	}
//}