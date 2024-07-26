package com.java.dsa;

public class SortingAlgo {

	public static void main(String[] args) {
	
		int arrTobeSorted[]= {4,3,7,5,9,2,6,8,1};
		
		System.out.println("Before Sorting");
		for(int value:arrTobeSorted) {
			System.out.print(value+" ");
		}
		
		bubbleSorting(arrTobeSorted);
		
		
		System.out.println();
		System.out.println("After Sorting");
		for(int value:arrTobeSorted) {
			System.out.print(value+" ");
		}
	}

	private static void bubbleSorting(int[] arr) {

		for (int i = 0; i < arr.length-1; i++) {

			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		}
	}
}
