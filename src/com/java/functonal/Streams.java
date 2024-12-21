package com.java.functonal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static void main(String args[]) {
	//nput: [1, 2, 3, 1, 2, 4, 5]
//		Output: [1, 2]
		
		int [] nums= {1, 2, 3, 1, 2, 4, 5};
		
		Set<Integer> set= new HashSet<>();
		Map<Integer,Integer> values=new HashMap();;
		
		for(int i=0;i<nums.length;i++) {
			
			if(values.containsKey(nums[i])) {
				set.add(nums[i]);
			}
			values.put(nums[i],i);
		}
		
		System.out.println(set);
		
	}
}
