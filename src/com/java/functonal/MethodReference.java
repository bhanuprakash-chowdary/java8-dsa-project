package com.java.functonal;

import java.util.function.BiFunction;

class Arthimetic{
	
	public int add(int a,int b){
		return a+b;
	}
	static float add(int a,float b){
		return a+b;
	}
	static float add(float a,float b){
		return a+b;
	}
}


public class MethodReference {

	public static void main(String[] args) {

		
		
		
		BiFunction<Integer,Integer, Integer> bi1=new Arthimetic()::add;
		
		
		
		BiFunction<Integer,Float, Float> bi2=Arthimetic::add;
		BiFunction<Float,Float, Float> bi3=Arthimetic::add;
		

		System.out.println(bi1.apply(10, 20)); 
	}
}
