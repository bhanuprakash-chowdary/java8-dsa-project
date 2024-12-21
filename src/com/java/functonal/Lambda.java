package com.java.functonal;

import java.util.ArrayList;
import java.util.Collections;

interface Drawable{
	void Draw();
}
public class Lambda {

	public static void main(String args[]) {
		
		//@Without Lambda expression
		
//		Drawable d=new Drawable() {
//			
//			@Override
//			public void Draw() {
//				
//			}
//		};
		
		
		
		Drawable d1=()->{
			System.out.println("HI");
		};
		d1.Draw();
		
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Hi");
		list.add("Bhanu");
		list.add("Good");
		list.add("Morning");
		
		for(String o: list) {
			System.out.println(o);
		}
		
		Collections.sort(list,(a,b)->a.compareTo(b));
		list.forEach(n->System.out.println(n));
		
		
		Runnable r1=()->{
			System.out.println("HIIIIII");
		};
		
		r1.run();
		Thread t1=new Thread(r1);
		t1.start();
		Thread t2=new Thread(r1);
		t2.start();
		
		
		
		
	}
}
