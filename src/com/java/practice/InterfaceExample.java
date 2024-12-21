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



class Engine{
	public void start() {
		System.out.println("Starting");
	}
}

class Car{
	private Engine engine;
	
	Car(){
		this.engine=new Engine();
	}
	
	public void drive() {
		engine.start();
		System.out.println("Driving");
	}
}

public class InterfaceExample {

	public static void main(String args[]) {
		Car car=new Car();
		car.drive();;
	}
	
}
