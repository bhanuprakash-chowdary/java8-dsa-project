package com.java.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateStream {

	public static void main(String args[]) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,11,323);
		Predicate<Integer> greater=x ->x>5;
		Predicate<Integer> lesser=x ->x<10;
		System.out.println(greater.and(lesser));
		
		
		System.out.println(list.stream().filter(greater.and(lesser)).collect(Collectors.toList()));
	}
}
