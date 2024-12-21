package com.java.practice;

public class ProgrammingBasics {

	public static void main(String [] args) {
		//Reverse
		String str="Hello";
		int length=str.length();
		
		StringBuilder reversed=new StringBuilder();
		for(int i=length-1;i>=0;i--) {
			reversed.append(str.charAt(i));
		}
		System.out.println(reversed);
		
		//Palindrome
		
		boolean isPalindrome=false;
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				isPalindrome=true;
			}
		}
	}
}
