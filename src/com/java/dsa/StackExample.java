package com.java.dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackExample {

	public static String isValidString(String characters) {
		
		
		Stack<Character> openChar=new Stack<Character>();
		
		Map<Character,Character> values=new HashMap<>();
		values.put(']', '[');
		values.put('}', '{');
		values.put(')', '(');
		
		for(char ch:characters.toCharArray()) {
			
			if(ch=='[' || ch == '{'|| ch=='(') {
				
				openChar.push(ch);
			}else if (openChar.isEmpty() || values.get(ch)!=openChar.pop()) {
				return "Not a Valid String";
			}
		}
		return openChar.isEmpty()?"Valid String":"Not a Valid String";
	}
	
	public static void arrSum(int arrA[],int nA,int arrB[],int nB) {
		
		//1,2
		//8,8
		int remain=0;
		int sum=0;
		for(int i=arrA.length-1;i>=0;i--) {
			for(int j=arrB.length-1;j>=0;j--) {
				
			}
		}
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
		
		arrSum(new int [] {1,2},2,new int []{8,8},2);
		
		
//		System.out.println(isValidString("{([{}])}"));
		
	}
}
