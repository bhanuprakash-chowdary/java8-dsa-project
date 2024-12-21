package com.java.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test1 {
	public static void main(String[] args) {
		int[] a = { 10, 9, 7, 101, 23, 0, 0, 78, 0, 23 };
		
		int index=a.length-1;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]!=0) {
				a[index--]=a[i];
			}
		}
		while(index>=0) {
			a[index--]=0;
		}
		

		System.out.println(Arrays.toString(a));
			
		int firstLar=0;
		int secondLar=0;
		for (int i = 0; i < a.length; i++) {
			if (firstLar < a[i]) {
				secondLar = firstLar;
				firstLar = a[i];
			} else if (secondLar < a[i] && firstLar != a[i]) {
				secondLar = a[i];
			}

		}
		System.out.println("First and second largest values are "+firstLar + " : "+ secondLar);
		
		
		String str="Java is Object oriented program";
		HashMap<Character,Integer> values=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				values.put(str.charAt(i),values.getOrDefault(str.charAt(i), 0)+1);
			}
		}
		
		String []strAr=str.split(" ");
		String reverseStr="";
		for(int i=strAr.length-1;i>=0;i--) {
			
			for(int j=strAr[i].length()-1;j>=0;j--) {
				reverseStr=reverseStr+strAr[i].charAt(j);
			}
			reverseStr=reverseStr+" ";
			
		}
		System.out.println(reverseStr);
		System.out.println(Arrays.toString(strAr));
		
		System.out.println(values);
		
		System.out.println("Printing Sorted List ...");
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		
		HashMap<Integer,Integer> result=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			result.put(a[i],result.getOrDefault(a[i],0)+1); 
		}
		
		
		int value=12345;
		int reverse=0;
		while(value>0) {
			int remainder=value%10;
			reverse=reverse*10+remainder;
			value=value/10;
		}
		System.out.println(reverse);
		
		
		System.out.println("Pattern 1");
		int num=9;
		
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				for(int j=1;j<=i;j++) {
				System.out.print(i);
				} 
			}else {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("Pattern 2");
		for(int i=1;i<=num;i++) {
//			int j=1;
//			while(i>=j) {
				for(int j=1;j<=i;j++) {
				System.out.print(i);
//				j=j+1;
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		int n=10;
		printNumbers(n);
	}
	public static void printNumbers(int n) {
		if(n<1)
			return;
		printNumbers(n-1);
		System.out.print(n+" ");
	}
}  

