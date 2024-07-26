package com.java.lambda;

@FunctionalInterface
public interface Square {

	int calcuate(int a);
	
	default void defaultMethod() {
		System.out.println("HIi");
	}
	
}
