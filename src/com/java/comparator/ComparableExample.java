package com.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Interface that defines the natural ordering of objects(a single sorting logic) by implementing compareTo method in class itself 
class Person implements Comparable<Person> {

	public String name;
	public Integer age;
	
	public  Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

//	@Override
//	public int compareTo(Person obj) {
//		return this.name.compareTo(obj.name);
//	}
	
	@Override
	public int compareTo(Person obj) {
		return this.age.compareTo(obj.age);
	}
}

public class ComparableExample {
	
	public static void main(String args[]) {
		
		List<Person> list=new ArrayList<Person>();
		
		list.add(new Person("Ravilla",24));
		list.add(new Person("Chowdary",42));
		list.add(new Person("Prakash",23));
		list.add(new Person("Bhanu",27));
		list.add(new Person("Rbchowdary",28));
		list.add(new Person("Rbc",32));
		
		
		
		Collections.sort(list);
		
		list.stream().forEach(n->System.out.println(n.age+" "+n.name));
		
		
		
		
	}
}