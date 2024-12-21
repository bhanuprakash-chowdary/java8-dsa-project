package com.java.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingAlgorithms {
	
	public static void main(String[] args) {
		int[] arr = {3,2,4,1,5};
		
		insertionSort(arr);
		
		for(int a:arr) {
			System.out.print(a);
		}
		
	}
	
	public static void insertionSort(int[] arr) {
	   
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			for(int a:arr) {
				System.out.print(a);
			}
			
			System.out.println();
		}
		  List<Integer> numbers =new ArrayList<>();
		  int i=100;
		  while(i>0) {
			  numbers.add(i);
			  i--;
		  }

	        numbers.parallelStream()
	               .forEach(number -> System.out.println(number + " " + Thread.currentThread().getName()));
	}
	
}
