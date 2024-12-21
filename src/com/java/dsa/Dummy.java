package com.java.dsa;

class A{
	int a;
	int b;
}

class B{
	A ref;
	public void m1(int x){
		ref.a=x;
	}
	
	public int m2() {
		return ref.a;
	}
}
public class Dummy {

	public static void main(String[] args) {
		
		B b=new B();
		b.m1(2);
		System.out.println(b.m2());
	}
}
