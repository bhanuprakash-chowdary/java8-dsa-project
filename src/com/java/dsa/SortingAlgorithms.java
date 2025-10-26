package com.java.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class SortingAlgorithms {

	public static void main(String[] args) {

		bubbleSort();
		selectionSort();
		insertionSort();
		findSecondLargestElement();
		findDistintChar();
		hashingExample();
	}

	public static void bubbleSort() {

		int[] arr = { 5, 4, 1, 3, 2 };

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1 - i; j++) {

				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

		for (int num : arr)
			System.out.print(num + " ");

		System.out.println();
	}

	public static void selectionSort() {
		int[] arr = { 5, 4, 1, 3, 2 };

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[index]) {

					index = j;

				}

			}

			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;

		}

		for (int num : arr)
			System.out.print(num + " ");

		System.out.println();
	}

	public static void insertionSort() {

		int[] arr = { 5, 4, 1, 3, 2 };

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {

				arr[j + 1] = arr[j];
				j--;

			}

			arr[j + 1] = key;
		}
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}

	
	public static void findSecondLargestElement() {
		
		int[] arr = { 5, 4, 1, 3, 2,6,6};
		
		int frtLar=0,sndLar=0;
		for(int i=0;i<arr.length;i++) {
			
			
			if(arr[i]>frtLar) {
				sndLar=frtLar;
				frtLar=arr[i];
				
			}else if(arr[i]>sndLar && arr[i]!=frtLar) {
				sndLar=arr[i];
			}
		}
		
		System.out.println("First Largest :"+frtLar+"\nSecond Largest:"+sndLar);
		
	}
	
	
	public static void findDistintChar() {
		String str="BhanuprakashChowdary";
		
		Set<Character> set=new LinkedHashSet<>();
		
		for(char c:str.toCharArray()) {
			if(c!=' ')
			set.add(c);
		}
		System.out.println(set);
		
		
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(char c:str.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		
		System.out.println(map);
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			
			if(entry.getValue()>=3) {
				System.out.print("Character :"+entry.getKey()+ " Occurance :"+entry.getValue());
				System.out.println();
			}
		}
		
		char[] charArr=str.toCharArray();
		int left=0;
		int right=charArr.length-1;
		while(left<right) {
			
			char c=charArr[left];
			charArr[left]=charArr[right];
			charArr[right]=c;
			
			left++;
			right--;
			
		}
		
		System.out.println(Arrays.toString(charArr));
	}
	
	
	public static void hashingExample() {
		HashMap<String, Integer> map = new HashMap<>();

        // Two different strings with the same hash code
        String key1 = "Aa";
        String key2 = "BB";

        // Check hash codes
        System.out.println("Hash code of key1: " + key1.hashCode());
        System.out.println("Hash code of key2: " + key2.hashCode());

        // Add to the map
        map.put(key1, 1);
        map.put(key2, 2);

        // Print the map
        System.out.println("Map: " + map);
	}
}
