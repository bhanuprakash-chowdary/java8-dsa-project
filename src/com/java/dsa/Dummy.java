package com.java.dsa;

class A{
	int a;
	int b;
	
}

class B extends A{
	
	public void m1(int x){
		super.a=x;
	}
	
	public int m2() {
		return super.a;
	}
}
public class Dummy {

	public static void main(String[] args) {
		
		B b=new B();
		b.m1(2);
		System.out.println(b.m2());
	}
}
