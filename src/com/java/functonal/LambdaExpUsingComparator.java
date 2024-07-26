package com.java.functonal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Product{

	int id;
	String name;
	float price;
	
	public Product(int id,String name,float price) {
		
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
}
public class LambdaExpUsingComparator {

	public static void main(String[] args) {
	
		
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"Car",800000));
		list.add(new Product(2,"Bike",120000));
		list.add(new Product(3,"Scooter",80000));
		list.add(new Product(4,"JCB",290000));
		list.add(new Product(5,"LORRY",1200000));
		list.add(new Product(6,"BUS",2500000));
		list.add(new Product(7,"SportsCar",400000));
		
		
		Collections.sort(list,(p1,p2)->{  
	        return p1.name.compareTo(p2.name);  
	        });  
		
		 for(Product p:list){  
	            System.out.println(p.id+" "+p.name+" "+p.price);  
	        }  
		
		 
		 Stream<Product> sp=list.stream().filter(p->
			 p.price>500000
		 );
		 
		 sp.forEach(n->System.out.println(n.id +" "+ n.name ));
	}
}
