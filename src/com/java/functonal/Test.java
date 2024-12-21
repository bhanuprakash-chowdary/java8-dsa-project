package com.java.functonal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Test {

	public static void main(String[] args) {
		Map<Integer,Integer> list=new HashMap<>();
		int arr[]= {2,100,3,8,9,4,0,5,6,7};
		for(int i=0;i<arr.length;i++) {
			int value=1;
			
			if(!list.containsKey(arr[i])) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						value+=1;
					}
				}
				list.put(arr[i], value);
			}
		}
		System.out.println(list);
		
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(i!=arr[j]) {
					arr[i]=-1;
				}
			}
			
		}
		reverseArray(arr);
		
		int N=10;
		int A[]= {1,2,3,4,5,6,7,8,9,10};
		int B[]= {0,9,8,7,6,5,4,3,2,1};
		boolean res=false;
		for (int i = 0; i < N; i++) {
			boolean result=false;
			for (int j = 0; j < N; j++) {
				if (A[i] == B[j]) {
					result = true;
				}
			}
			if (!result) {
				res=result;
				break;
			}
		}
		System.out.println(res);
		
		int irrerate=arr.length-1;
		while(irrerate>0) {
			int temp=arr[arr.length-1];
			
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = temp;
			irrerate--;
		}
		System.err.println(Arrays.toString(arr));
		
		int i=0;
		int j=arr.length-1;
		
		while(i<=j) {
			//int arr[]= {6,2,3,4,5,1};
			//int arr[]= {6,1,2,3,4,5};
			int temp1=arr[i];
			arr[i]=arr[j];
			arr[j]=temp1;
			i++;
		}
		
		System.err.println(Arrays.toString(arr));
		
		
		
		
		
		int n=3;
		
		int mat[][]={ { 5, 4, 7 }, { 1, 3, 8 }, { 2, 9, 6 } }; 
		
		new Test().sortMatric(mat,n);
		
		
		int array[]= {1,2,3,4,5,6,7};
		int reverseArray[]=new int [array.length];
		
		for(int i1=0;i1<array.length;i1++) {
			reverseArray[i1]=array[array.length-i1-1];
		}
		System.out.println(reverseArray);
		
		
		
	}
	
	public void sortMatric(int [][] mat, int n) {
		
//		if(prev_node!=null) {
//			
//		}
		int []temp=new int [n*n];
		int k=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				temp[k]=mat[i][j];
				k++;
			}
		}
		
		//Diffence between ++i(Increment and Assign);i++(assign and increment)
		for (int i = 0, j = i; i < temp.length-1; j = ++i) {
            int ai = temp[i + 1];
            while (ai < temp[j]) {
            	temp[j + 1] = temp[j];
                if (j-- == 0) {
                	System.out.println("break");
                    break;
                }
            }
            temp[j + 1] = ai;
        }
		
//		for (int i = 0; i < temp.length; i++) 
//            for (int j = i+1; j < temp.length; j++) 
//            	if(temp[i]<=temp[j]) {
//            		
//            	}
		
		
		int k1 = 0; 
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                mat[i][j] = temp[k1++]; 
        
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) 
                System.out.print(mat[i][j] + " "); 
            System.out.println(); 
        } 
		
	}

	public static void reverseArray(int arr []) {
		
//		int size=arr.length;
//		int reverseArr[]=new int[size];
//		for(int i = 0; i < size; i++) {
//			reverseArr[i]=arr[size-1-i];
//		}
//		System.out.println(Arrays.toString(reverseArr));
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]<arr[j])
//			}
//		}
//		
//		int min=arr[0];
//		System.out.println("min :"+min+" max :"+max);
	}
}
