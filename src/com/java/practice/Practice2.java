package com.java.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice2 {
	
	
	public static void main(String[] args) {
		
		
		try {
			
			int [] nums=new int []{1,2,4,5};
			
			int target=6;
			
			System.out.println(Arrays.toString(new Practice2().twoSum(nums,target)));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
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
	
	
	
	
	
	
	public int[] twoSum(int[] nums, int target) throws Exception {
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
	    throw new Exception("No Two Found");
	}

}