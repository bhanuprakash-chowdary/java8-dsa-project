package com.java.dsa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Arrray2D {

	public static void main(String [] args) {
		
		
		
		int [][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int [] arr:matrix) {
			
//			System.out.println(arr[0]+" "+arr[1]);
		}
		
		
		for(int i=0;i<matrix.length;i++) {
			
			for(int j=0;j<matrix.length;j++) {
//				System.out.print(matrix[i][j]+" ");
			}
		}
		
		
		int [] arr= {2,1,6,5,4,7,10,9,8};
		
		Set<Integer> sortedArray=new TreeSet<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
		
		System.out.println("using tree : "+sortedArray);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Index i : "+i+" value : "+arr[i]);
			for (int j = i + 1; j < arr.length; j++) {
				System.out.println("Index j : "+j+" value : "+arr[j]);
				if (arr[i] > arr[j]) {
					System.out.println("Swaping "+arr[i] +" "+ arr[j]);
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
