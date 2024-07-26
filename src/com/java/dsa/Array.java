package com.java.dsa;

public class Array {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int target = 10;

		int index1 = linearSearch(arr, target);
		int index = binarySearch(arr, target,0,arr.length-1);
		if (index != -1) {
			System.out.println("Element found at index of :" + index);
		} else {
			System.out.println("Element not found");
		}
	}

	public static int linearSearch(int[] arr, int target) {
		int steps=0;
		for (int i = 0; i < arr.length; i++) {
			steps++;
			if (arr[i] == target) {
				System.out.println("Steps taken for linear to find the Element :" + steps);
				return i;
			}
		}

		return -1;
	}

	public static int binarySearch(int[] arr, int target,int left,int right) {

		if(left<=right) {
			
			
			int m=(left+right)/2;
			if(arr[m]==target) {
				return m;
			}else if(arr[m]<target) {
				return binarySearch(arr,target,m+1,right);
			}else {
				return binarySearch(arr,target,left,m-1);
			}
		}

		return -1;
	}

}
