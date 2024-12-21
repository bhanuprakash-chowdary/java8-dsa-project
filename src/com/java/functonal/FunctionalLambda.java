package com.java.functonal;

public interface FunctionalLambda {

	public void sum(int a,int b) throws InterruptedException;
	
	default void method(int x) {
		System.out.println("HI");
	}
}
