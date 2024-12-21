package com.java.designpatterns;

//Defining a class that has only one instance and provides a global point to access it. 
//Ensuring only single instance is created and that object can be used by all other classes
public class SingletonPattern {

	private SingletonPattern instance;
	
	private SingletonPattern() {
		
	}
	
	public SingletonPattern getInstance() {
		if(instance==null) {
			new SingletonPattern();
		}
		return instance;
	}
}
