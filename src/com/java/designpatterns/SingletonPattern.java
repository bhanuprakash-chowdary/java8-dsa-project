package com.java.designpatterns;

//Defining a class that has only one instance and provides a global point to access it. 
//This is particularly useful when exactly one object is needed to coordinate actions across the system.
public class SingletonPattern {

	private SingletonPattern instance;
	
	private SingletonPattern() {
		
	}
	
	public SingletonPattern getInstance() {//global point of access
		if(instance==null) {
			new SingletonPattern();
		}
		return instance;
	}
}
