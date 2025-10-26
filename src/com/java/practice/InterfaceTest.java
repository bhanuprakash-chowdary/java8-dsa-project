package com.java.practice;

interface Interface1 {

	public int value=0;
	public void behavioral1a() ;
	public void behavioral1b();
	default void behavioralDefault() {
		System.out.println("Interface 1");
	}
	
	static void staticFunction() {
		System.out.println("Static FUnction ");
	}
	
}
abstract class Interface2 {
	public void behavioral2a() {
		
	}
	public void behavioral2b() {
		
	}
	public void behavioralDefault1() {
		System.out.println("abstract 1");
	}
}

public class InterfaceTest implements  Interface1  {

	public static void main(String[] args) {
		InterfaceTest obj=new InterfaceTest();
		
		obj.behavioralDefault();
//		obj.staticFunction();
	}

	@Override
	public void behavioral1a() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void behavioral1b() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void behavioralDefault(){
		System.out.println("abajsh");
	}
	
//	static void staticFunction() {
//		System.out.println("abajshsddfdff");
//	}
	
	
	
}


class A {
    void display() {
        System.out.println("Display 1 from A");
    }
    
    void display2() {
    	System.out.println("Display 2 from A");
    }
}

class B {
    void display1() {
        System.out.println("Display from B");
    }
}

class C extends A {
	@Override
	void display() {
		System.out.println("Display from C");
	}
}
