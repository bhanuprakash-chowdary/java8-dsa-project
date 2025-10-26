package com.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortingCollection {
	public static void main(String [] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(2);
//		
//		
////		Collections.unmodifiableList(list);
//		System.out.println(list);
//		Collections.sort(list,new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o1-o2;
//			}
//			
//		});
//		System.out.println(list);
//		
//		
//		Collections.sort(list,(num1,num2)->(num1>num2)?1:(num1<num2)?-1:0);
//		System.out.println(list);
		
		
		System.out.println(list.stream().max((a,b)->a.compareTo(b)).orElse(0));
		
		Collections.sort(list,Comparator.comparing(a->a));
		System.out.println(list);
		
	}
	
	
}
