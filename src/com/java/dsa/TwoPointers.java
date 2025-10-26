package com.java.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoPointers {

	public static void main(String[] args) {

		
		int nums[]= {1,0,4,6,8,0,4,3,0,4,0,0};
		
		int length=nums.length-1;
		int index=length;
		for(int i=length;i>=0;i--) {
			if(nums[i]!=0) {
				nums[index--]=nums[i];
			}
		}
		
		while(index>=0) {
			nums[index--]=0;
		}
		
		for(int num:nums) System.out.print(num+ " ");
		
		//----------------//
		
		
		int zeroAtEndArray []= {1,0,4,6,8,0,4,3,0,4,0,0};
		
		System.out.println();
		
		int left=0;
		
		for(int num:zeroAtEndArray) {
			
			if(num!=0) {
				zeroAtEndArray[left++]=num;
			}
		}
		
		while(left<zeroAtEndArray.length) {
			zeroAtEndArray[left++]=0;
		}
		
		for(int num:zeroAtEndArray)System.out.print(num+" ");
		
		
		//-----------------//
		System.out.println();
		int target=4;
		
		int removeTarget []= {1,0,4,6,8,0,4,3,0,4,0,0};
		for(int i=0;i<removeTarget.length;i++) {
			if(removeTarget[i]==target) {
				removeTarget[i]=0;
			}
		}
		
//		for(int num: removeTarget) {
//			if(num==target) {
//				num=0;
//			}
//		}
		
		int xlength=removeTarget.length-1;
		int xindex=xlength;
		for(int i=xindex;i>=0;i--) {
			if(removeTarget[i]!=0) {
				removeTarget[xindex--]=removeTarget[i];
			}
		}
		
		while(xindex>=0) {
			removeTarget[xindex--]=0;
		}
		
		for(int num:removeTarget)System.out.print(num+ " ");
		
		
		//////////----///
		
		System.out.println();
		
		int [] arr1= {5,4,1,2,3};
		
		
		for(int i=0;i<arr1.length-1;i++) {
			
			for(int j=0;j<arr1.length-1-i;j++) {
				
				if(arr1[j]>arr1[j+1]) {
					
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
				}
			}
		}
		for(int num:arr1)System.out.print(num+ " ");
		
		
		
//		int countOfNonZeros=0;
//		
//		int length1=zeroAtEndArray.length-1;
//		
//		
//		for(int i=0;i<=length;i++) {
//			
//			if(zeroAtEndArray[i]!=0) {
//				zeroAtEndArray[countOfNonZeros++]=zeroAtEndArray[i];
//			}
//		}
//		
//		while(countOfNonZeros<=length1) {
//			zeroAtEndArray[countOfNonZeros++]=0;
//		}
//		
//		for(int num:zeroAtEndArray) System.out.print(num+" ");
		
		
		
		
		
		
		
//		System.out.println(set);
		
		
//		int arr[] = { 1, 3, 4, 5, 7, 10, 11, 19, 20 }, sum = 30;
//		System.out.println(checkFactorial(5));
//		int result=recursionCall(5,10);
//		System.out.println(result);

	}

	  public static int  removeElement(int[] nums, int val) {
	        int i = 0; // Pointer for valid elements
	        for (int j = 0; j < nums.length; j++) {
	            if (nums[j] != val) {
	                nums[i] = nums[j]; // Copy valid element to position `i`
	                i++;
	            }
	        }
	        return i; // Return the length of the modified array
	    }

//		int[] arr = { 8, 3, 5, 1, 7, 6, 2, 4 };
//		System.out.println("Original Array:");
//		printArray(arr);
//
//		mergeSort(arr, 0, arr.length - 1);
//
//	}
//	
//	
//	
//	
	public static int checkFactorial(int value) {
		
		//5*4*3*2*1;
		if(value==1) {
			return 1;
		}
		return value*checkFactorial(value-1);
	
	}
	
	public static int recursionCall(int start,int end) {
		if(end>start) {
			return end+ recursionCall(start,end-1);
		}else {
			return end;
		}
	}
}

//
//	}
//
//	public static void mergeSort(int[] arr, int left, int right) {
//
//		if (left < right) {
//
//			int mid = left + right / 2;
//			mergeSort(arr, left, mid);
//			mergeSort(arr, mid + 1, right);
//
//			merge(arr, left, mid, right);
//		}
//
//	}
//
//	public static void merge(int[] arr, int left, int mid, int right) {
//		// Sizes of the two subarrays
//		int n1 = mid - left + 1;
//		int n2 = right - mid;
//
//		// Temporary arrays to hold the data
//		int[] leftArray = new int[n1];
//		int[] rightArray = new int[n2];
//
//		// Copy data to the temporary arrays
//		for (int i = 0; i < n1; i++) {
//			leftArray[i] = arr[left + i];
//		}
//		for (int j = 0; j < n2; j++) {
//			rightArray[j] = arr[mid + 1 + j];
//		}
//
//		// Merge the temporary arrays back into the original array
//		int i = 0, j = 0; // Initial indexes of the left and right arrays
//		int k = left; // Initial index of the merged array
//
//		while (i < n1 && j < n2) {
//			if (leftArray[i] <= rightArray[j]) {
//				arr[k] = leftArray[i];
//				i++;
//			} else {
//				arr[k] = rightArray[j];
//				j++;
//			}
//			k++;
//		}
//
//		// Copy any remaining elements of the left array
//		while (i < n1) {
//			arr[k] = leftArray[i];
//			i++;
//			k++;
//		}
//
//		// Copy any remaining elements of the right array
//		while (j < n2) {
//			arr[k] = rightArray[j];
//			j++;
//			k++;
//		}
//	}
//
//	public static void printArray(int[] arr) {
//		for (int num : arr) {
//			System.out.print(num + " ");
//		}
//		System.out.println();
//	}
//}
