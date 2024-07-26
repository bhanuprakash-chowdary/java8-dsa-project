package com.java.practice;

interface Shape{
	double getArea();
	double getParameter();
}

class Circle implements Shape{

	public int radius;
	
	public Circle(int radius) {
		this.radius=radius;
	}
	
	@Override
	public double getArea() {
		return radius*radius;
	}

	@Override
	public double getParameter() {
		// TODO Auto-generated method stub
		return 2*radius;
	}
	
}





public class InterfaceExample {

	public static void main(String args[]) {
//		Circle cir=new Circle();
//		cir.radius;
	}
	
}
