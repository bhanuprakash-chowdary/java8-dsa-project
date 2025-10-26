package com.java.practice;

import java.util.function.Function;
import java.util.function.Predicate;

public class Varibles {

	{
		System.out.println("Instance block 1");
	}
	
	{
		System.out.println("Instance block 2");
	}
	
	public static void function() {
	}
	
	public static void main(String [] args) {
		function();
		
//		Function<Integer,String> test=;
		
		
		new Function<Integer,Boolean>() {

			@Override
			public Boolean apply(Integer t) {
				return true;
			}
			
		};
		
		
//		Funtion<Integer> value=(a)-> a%2==0?"True":"False";
//		
//		value.test(5);
//		
//		System.out.println(value.test(5));
		
		
		System.out.println(new VariblesParent().a);
		
	}
	
	static {
		System.out.println("Static block 1");
	}
	
	
	static class VariblesParent {
		
		int a=10;
		int b=20;
	}
}

