package com.java.dsa;

import java.util.HashSet;

public class LeetCodeProblems {

	public static void main(String[] args) {
		
		int[] arr = { 2, 1, 5, 1, 3, 2};
		int windowSize=3;
		findingSumOfSubArray(arr,windowSize);
		
		String s="pwwkew";
		findLongestSizeSubString(s);
		
		System.out.println(findMedianSortedArrays(new int [] {1,2,5},new int []{3,4})); 
		
		System.out.println(longestPalindrome("baabad"));
		
	}

	private static void findLongestSizeSubString(String s) {
		int maxLengh=0;
		int start=0;
		HashSet<Character> set=new HashSet<>();
		for(int end=0;end<s.length();end++) {
			
			while(set.contains(s.charAt(end))) {
				set.remove(s.charAt(start));
				start++;
			}
			
			maxLengh=Math.max(maxLengh,end-start+1);
			set.add(s.charAt(end));
		}
		System.out.println(maxLengh);
	}

	private static void findingSumOfSubArray(int[] arr, int windowSize) {

		int maxSum=Integer.MIN_VALUE;
		int windowSum=0;
		
		for(int i=0;i<windowSize;i++) {
			windowSum+=arr[i];
		}
		
		for(int i=windowSize;i<arr.length;i++) {
			windowSum+=arr[i]-arr[i-windowSize];
			maxSum=Math.max(maxSum, windowSum);
		}
		System.out.println(maxSum);
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n = nums1.length;
		int m = nums2.length;
		int merged[] = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {

			if (nums1[i] < nums2[j]) {
				merged[k++] = nums1[i++];
			} else {
				merged[k++] = nums2[j++];
			}
		}
		while (i < n) {
			merged[k++] = nums1[i++];
		}

		while (j < m) {
			merged[k++] = nums2[j++];
		}

		int size = merged.length;

		if (size % 2 == 1) {
			return merged[size / 2];
		} else {
			return (merged[size / 2 - 1] + merged[size / 2]) / 2.0;
		}
	}
	
	public static String longestPalindrome(String s) {
		if (s == null || s.length() < 1)
			return "";

		int start = 0, end = 0;

		for (int i = 0; i < s.length(); i++) {
			// Expand around a single character (odd-length palindrome)
			int len1 = expandFromCenter(s, i, i);
			// Expand around a pair of characters (even-length palindrome)
			int len2 = expandFromCenter(s, i, i + 1);

			// Take the longer of the two lengths
			int len = Math.max(len1, len2);
			if (len > end - start) {
				// Update start and end based on the new longest palindrome
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}

		// Return the longest palindrome substring
		return s.substring(start, end + 1);
	}

	private static int expandFromCenter(String s, int left, int right) {
		// Expand outward while characters match and indices are in bounds
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		// Return the length of the palindrome found
		return right - left - 1;
	}
}
