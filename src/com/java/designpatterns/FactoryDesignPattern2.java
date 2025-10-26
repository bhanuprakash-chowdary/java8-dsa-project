package com.java.designpatterns;

public class FactoryDesignPattern2 {

	public static void main(String[] args) {
		
		Product product=new ConcreateCreator().factoryMethod();
		product.create();
		
	}
}

interface Product{
	void create();
}

class ConcreateProduct implements Product{

	@Override
	public void create() {
		System.out.println("Create");
	}
	
}

interface Creator{
	Product factoryMethod();
}

class ConcreateCreator implements Creator{

	@Override
	public Product factoryMethod() {
		
		return new ConcreateProduct();
	}
	
}
