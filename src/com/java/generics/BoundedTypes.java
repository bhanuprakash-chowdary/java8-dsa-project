package com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class BoundedTypes {

	
	public static void main(String[] args) {
		
		
		UpperBound<Integer> intValues=new UpperBound<>();
		UpperBound<Double> doubleValues=new UpperBound<>();
		
		
		LowerBound lower=new LowerBound();
		
		List<Integer> list=new ArrayList<>();
		lower.addValue(list);
		
		
	}
	
	
	public <T, U> void printList(U value,T value2) {
		
	}
}


class UpperBound<T extends Number> {

	private T value;

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
}


class LowerBound{

	
	public void addValue(List <? super Integer> list) {
	
		list.add(10);
	}
}