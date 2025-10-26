package com.java.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice2 {
	
	
	public static void main(String[] args) {

		try {

			int[] nums = new int[] { 1, 2, 4, 5 };

			int target = 6;

			System.out.println(Arrays.toString(new Practice2().twoSum(nums, target)));

		} catch (Exception e) {
			e.printStackTrace();
		}

		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

//		int length = nums.length;
//		int index = 0;
//
//		for (int i = 0; i < length; i++) {
//
//			if (nums[i] % 2 == 0) {
//				int temp = nums[index];
//				nums[index++] = nums[i];
//				nums[i] = temp;
//			}
//		}

		int right = nums.length - 1;
		int left = 0;

		while (left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}

		int iMax=nums.length-1;

		if(iMax==-1)
			System.out.println("Empty");

		StringBuffer sb=new StringBuffer();
		sb.append("[");
		for (int i = 0; i <= iMax; i++) {
			sb.append(nums[i]);
			if (i == iMax) {
				sb.append("]");
			} else {
				sb.append(",");
			}
		}
		
		System.out.println(sb);
		

	}

	public int[] twoSum(int[] nums, int target,int num) throws Exception {
	   
		 for(int i=0;i<nums.length;i++) {
			 for(int j=i+1;j<nums.length;j++) {
				 
				 if(nums[i]+nums[j]==target) {
					 return new int[] {i,j};
				 }
			 }
		 }
		
	    throw new Exception("No Two Found");
	}
	
	
	public int[] twoSum(int[] nums, int target)   {
	    Map<Integer, Integer> map = new HashMap<>();
	    
	    for(int i=0;i<nums.length;i++) {
	    	
	    	int complement=target-nums[i];
	    	if(map.containsKey(nums[i])) {
	    		return new int[] {complement,nums[i]};
	    	}
	    	
	    	map.put(nums[i],i);
	    	
	    	
//	    	int complement=target-nums[i];
//	    	if(map.containsKey(complement)) {
//	    		return new int[] {map.get(complement),i};
//	    	}
//	    	
//	    	map.put(nums[i], i);
	    }
	    throw new IllegalArgumentException("No Two Found");
	}

}