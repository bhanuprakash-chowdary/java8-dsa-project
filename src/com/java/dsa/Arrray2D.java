package com.java.dsa;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Arrray2D {

	public static void main(String [] args) {
		
		
		
		int [][] matrix= {{1,2,3},
						  {4,5,6},
						  {7,8,9}};
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
		}
		
		
		
		int [] arr= {2,1,6,5,4,7,10,9,8};
		
		Set<Integer> sortedArray=new TreeSet<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
		
//		System.out.println("using tree : "+sortedArray);
		
		
	}
}
