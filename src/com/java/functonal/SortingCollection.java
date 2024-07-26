package com.java.functonal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortingCollection {
	public static void main(String [] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(2);
		
		
//		Collections.unmodifiableList(list);
		System.out.println(list);
		Collections.sort(list,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
			
		});
		System.out.println(list);
		
		
		Collections.sort(list,(num1,num2)->(num1>num2)?1:(num1<num2)?-1:0);
		System.out.println(list);
	}
	
	
}
