package com.java.java8;

import java.util.Arrays;
import java.util.stream.Stream;

import javax.swing.GroupLayout.ParallelGroup;

public class Streams2 {

	public static void main(String[] args) {
		
		
		int []nums= {5,2,6,3,4,1};
		
		Arrays.stream(nums).filter(n->n%2==0).forEach(x->System.out.println(x+" "));
		
		Stream.of("Bhanu","Prakash","Char").sorted((x,y)-> Integer.compare(x.length(), y.length())).forEach(n->System.out.print(n+" "));
		
		System.out.println();
		Stream.of("Bhanu","Prakash","Char").filter(s->s.length()>=5).map(s-> s.length()).forEach(s -> System.out.print(s+" "));
		
		System.out.println();
		Stream.of("Bhanu","Prakash","Chowdary","Ravilla","Ravilla","LinkedIn","Java","Spring Boot").skip(5).forEach(s -> System.out.print(s+" "));
		
		System.out.println();
		Stream.of("Bhanu","Prakash","Chowdary","Ravilla","Ravilla","LinkedIn","Java","Spring Boot").parallel().forEach(s -> System.out.print(s+" "));;
		
		
		
		
		

	}
}
