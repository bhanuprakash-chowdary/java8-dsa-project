package com.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonNameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.name.compareTo(o2.name);
	}
}


class PersonAgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.age.compareTo(o2.age);
	}
}

public class ComparatorExample{
	public static void main(String []args) {
		
		List<Person> list=new ArrayList<Person>();
		
		list.add(new Person("Ravilla",24));
		list.add(new Person("Chowdary",42));
		list.add(new Person("Prakash",23));
		list.add(new Person("Bhanu",27));
		list.add(new Person("Rbchowdary",28));
		list.add(new Person("Rbc",32));

//		Collections.sort(list,new PersonAgeComparator());
//		list.stream().forEach(n->System.out.println(n.age+ " " +n.name));
//		
//		System.out.println();
//		Collections.sort(list,new PersonNameComparator());
//		list.stream().forEach(n->System.out.println(n.age+ " " +n.name));
		
		
		
		//advanced
		
//		Collections.sort(list,());
	}
}
