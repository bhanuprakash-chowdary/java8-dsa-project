package com.java.java8;

public interface FunctionalLambda {

	public void sum(int a,int b) throws InterruptedException;
	
	default void method(int x) {
		System.out.println("HI");
	}
}
