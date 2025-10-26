package com.java.practice;

class ClassA {

	protected String name;
	
	public void init() {
		name="Bhanu";
	}
	
	{
		System.out.println(name);
	}
	
	public ClassA(String name) {
		this.name=name;
		System.out.println("Class A Constructor: "+name);
	}
}

class ClassB extends ClassA {

	public ClassB(String name) {
		super(name);
		System.out.println("Class B Constructor: " + name);
	}

	public void displayInfo() {
		System.out.println("Name: " + name);
	}

}

public class TestConstructor {
    public static void main(String[] args) {
    	ClassB dog = new ClassB("Buddy");
        dog.displayInfo();
    }
}
