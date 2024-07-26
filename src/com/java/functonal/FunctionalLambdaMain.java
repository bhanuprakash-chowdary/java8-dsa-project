package com.java.functonal;

import java.rmi.server.Operation;
import java.util.ArrayList;

public class FunctionalLambdaMain {

	
	
	interface funcInterface1 {
		int operation(int mobile1,int mobile2,int alreadyBorrowedAmount,int d);
	}
	
	interface funcInterface2{
		void sayMessage(String message);
	}
	
	private int operate(int a,int b,int c,int d,funcInterface1 interface1) {
		return interface1.operation(a,b,c,d);
	}
	
	public static void main(String [] args) throws InterruptedException {
		
		
		
		funcInterface1 add1=(a,b,c,d)->a*2+b*2+c*2+d*4;
		funcInterface1 add2=(a,b,c,d)->a+b+c+d;
		funcInterface1 multi=(a,b,c,d)->a*b;
		
		FunctionalLambdaMain obj=new FunctionalLambdaMain();
		
		
		
		int p=obj.operate(8577, 14000,75000,25000, add2);
		System.out.println("Current Debt to p:"+p);
		
		int a=obj.operate(5300,7105,6211,6253, add1);
		System.out.println("Current Debt from apps :"+a);
		
		
		int total=a+p;
		
		funcInterface2 saySomething=message->System.out.println("Hello "+message);
		
		
		saySomething.sayMessage("Stupid  :"+total);
		
		
		
		
		
		
		
		
		
		
//		FunctionalLambda lambda=(a,b)->System.out.println(a+b);
//		lambda.sum(1,3);
		
//		FunctionalLambda lambda=new FunctionalLambda() {
//			
//			@Override
//			public void sum(int a, int b) throws InterruptedException {
////				Thread.wait(1000);
//				System.out.println(a+b);
//				
//			}
//		};
//		
//		lambda.sum(4, 9);
//		
//		FunctionalLambda lambda1=(a,b)->System.out.println(a+b);
//		
//		
//		lambda1.sum(4,10);
//		lambda1.method(0);
//
//		ArrayList<Integer> arr=new ArrayList<Integer>();
//		arr.add(0);
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		arr.add(4);
//		arr.add(5);
//		arr.add(6);
//		arr.add(7);
//		arr.add(8);
//		arr.add(9);
//		arr.add(10);
//		
//		
//		
//		arr.forEach(n->System.out.print(n+" "));
//		System.out.println();
//		arr.forEach(n->{if(n%2==0)System.out.print(n+" ");});
		
		
		
		
 	}
}
