package com.java.lambda;

public class TestLambdaExp implements Square {

	public static void main(String[] args) {
		
		TestLambdaExp obj=new TestLambdaExp();
		
		System.out.println(obj.calcuate(344));
		
		Square s=(a)->a*a;
		
		System.out.println(s.calcuate(344)); 
	}

	@Override
	public int calcuate(int a) {
		return a*a;
	}
	
}
