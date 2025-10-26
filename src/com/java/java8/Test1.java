package com.java.java8;

public class Test1 extends Test {
	
	@Override
	public void sortMatric(int[][] mat, int n) {
	// TODO Auto-generated method stub
	super.sortMatric(mat, n);
	}
	    public static void main(String[] args) {
	        if (args.length > 0) {
	            System.out.println("Command-line arguments:");
	            for (String arg : args) {
	                System.out.println(arg);
	            }
	        } else {
	            System.out.println("No command-line arguments provided.");
	        }
	    }
}
