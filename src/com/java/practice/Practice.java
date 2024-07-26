package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {

		String str = "bhanuprakash Chowdary";
		Map<Character, Integer> values = new HashMap<Character, Integer>();
		Map<Character, Boolean> visited = new HashMap<Character, Boolean>();

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);

			// Initialize the visited map for the character if it's not already present
			visited.putIfAbsent(currentChar, false);

			if (!visited.get(currentChar)) {
				int count = 0;
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == currentChar) {
						count++;
					}
				}
				values.put(currentChar, count);
				visited.put(currentChar, true);
			}
		}

		System.out.println("Repeated Characters :"+values);
		System.out.println();
		int arr[] = { 1, 2, 3, 7, 20, 25, 100, 25, 234, 65, 7000, 32, 44, 33 };
		System.out.print("Actual Array : ");
		for(int ar:arr) {
			System.out.print(ar+" ");
		}
		int big = 0;
		for (int i = 0; i < arr.length; i++) {
			if (big < arr[i]) {
				big = arr[i];
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Biggest Number before Sorting: "+big);
		System.out.println();
		// 0 1 1 2 3 5 8 13 21 34
		// fibinoci
		int first = 0;
		int second = 1;
		System.out.print("Fibinoci :");
		for(int i=0;i<=10;i++) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}

		System.out.println();
		System.out.println();
		
		int factorial=5;
		
		for(int i=factorial-1;i>0;i--) {
			factorial=factorial*i;
		}
		System.out.println("factorial :"+factorial);
		
		

		///reverse a String 
		

		int left=0;
		int right=arr.length-1;
		while(left<right) {
			
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			
			left++;
			right--;
		}
		System.out.println();
		System.out.print("Reversed Array : ");
		for(int ar:arr) {
			System.out.print(ar+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.print("Sorted Array using bubble sort: ");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int ar:arr) {
			System.out.print(ar+" ");
		}
		
		System.out.println();
		System.out.println();
		
		
		int target=1001;
		System.out.println(target+" found at index : "+ binarySearch(arr, target, 0, arr.length-1));
		System.out.println();
		
		
		//Palindrome
		String key="RADARA";
		
		int leftPali=0;
		int rightPali=key.length()-1;
		boolean isPalindrome=true;
		while(leftPali<rightPali) {
			if(key.charAt(leftPali)!=key.charAt(rightPali)) {
				isPalindrome=false;
			}
			leftPali++;
			rightPali--;
		}
		
		System.out.println(key+" is a palindrome : "+isPalindrome);
		
		
	}
	
	public static int binarySearch(int [] arr,int target,int left,int right) {
		
		if(left>right) {
			return -1;
		}
		int m=(left+right)/2;
		if(arr[m]==target) {
			return m;
		}
		if(arr[m]<target) {
			return binarySearch(arr,target,m+1,right);
		}else if(arr[m]>target) {
			return binarySearch(arr,target,left,m-1);
		}
		return -1;
	}

}
