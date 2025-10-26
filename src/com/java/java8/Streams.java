package com.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static void main(String args[]) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		
//		numbers.stream().filter(n->n%2==0).
		
		
		System.out.println(numbers.stream().filter(number -> number % 2 == 0).mapToInt(e -> e * 2).sum());

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			list.add(i);
		}
		
		list.stream().filter(n->n%2==0).forEach(n-> System.out.print(n+" "));
		
		
		
		Stream<Integer> seq = list.stream();
		Stream<Integer> seHihtq = seq.filter(p -> p > 90);
		seHihtq.forEach(q -> System.out.print(q + " "));

		System.out.println();

		System.out.println(list.stream().filter(i -> i % 2 == 0).mapToInt(i -> i * 2).reduce(0,Integer::max));
		
		List<String> words = Arrays.asList("hello", "world");
		
		words.stream().map(n-> n.toLowerCase()).forEach(System.out::println);
		words.stream().map(n-> n.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);;
		
		Optional<String> first = Stream.of("apple", "banana", "cherry").findFirst();
		System.out.println(first);
		
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "Car", 40));
		productsList.add(new Product(2, "Bike", 20));
		productsList.add(new Product(3, "Scooter", 10));
		productsList.add(new Product(4, "JCB", 60));
		productsList.add(new Product(5, "LORRY", 45));
		productsList.add(new Product(6, "BUS", 50));
		productsList.add(new Product(7, "SportsCar", 70));
		productsList.add(new Product(8, "HP Laptop", 14));
		productsList.add(new Product(9, "Dell Laptop", 16));
		productsList.add(new Product(10, "Lenevo Laptop", 15));
		productsList.add(new Product(11, "Sony Laptop", 25));
		productsList.add(new Product(12, "Apple Laptop", 30));
		
		List<Float> filteredWithOutStreams=new ArrayList<>();
		
		for(Product obj:productsList) {
			if(obj.price>40)
				filteredWithOutStreams.add(obj.price);
		}
		System.out.println(filteredWithOutStreams);
		
		
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 101,5000));
        employees.add(new Employee(2, "Bob", 102,10000));
        employees.add(new Employee(3, "Charlie", 101,15000));
        employees.add(new Employee(5, "Eve", 102,20000));
        employees.add(new Employee(4, "David", 103,250000));
        
        
        
        
        
        
        List<Department> departments = new ArrayList<>();
        departments.add(new Department(101, "HR"));
        departments.add(new Department(102, "IT"));
        departments.add(new Department(103, "Finance"));
        
        
        
        for(Employee obj:employees) {
        	if(obj.getName().equals("David")) {
        		obj.incrementSalary(10);
        	}else {
        		obj.incrementSalary(0);
        	}
        }
        
        employees.forEach(System.out::print);
        
        List<List<String>> nestedList = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C", "D"));
        nestedList.stream().flatMap(List::stream).forEach(System.out::println);

        
        
        departments.stream().collect(Collectors.toMap(Department::getId,department-> department));
//        
//        employees.stream().collect(Collectors.groupingBy(employe -> departments.get(employe.getDepartmentId())));
//        
        
		
		
		List<Float> stremObj=productsList.stream().filter(n->n.price>40).map(p->p.price).collect(Collectors.toList());
		System.out.println();
		System.out.println(filteredWithOutStreams);
		
		Stream.iterate(1, element->element+1).filter(element-> element%5==0).limit(5).forEach(e->System.out.println(e));
		

		productsList.stream().forEach(n->System.out.print(n.id+" "+n.name+" "+(n.price+10) +" | "));
		 
		productsList.stream().filter(p->p.price>40).forEach(n->System.out.print(n.id+" "+n.name+" "+n.price +" | "));
		System.out.println();
		
		System.out.println(productsList.stream().map(p->p.price).reduce(0.0f,(sum,p)->sum+p));
		System.out.println();
		
		System.out.println(productsList.stream().map(p->p.price).reduce(0.0f,Float::sum));
		System.out.println();
		
		System.out.println(productsList.stream().collect(Collectors.summingDouble(p->p.price)));
		System.out.println();
		
		System.out.println(productsList.stream().max((p1,p2)->p1.price>p2.price?1:-1).get().price);
		System.out.println();
		
		System.out.println(productsList.stream().min((p1,p2)->p1.price>p2.price?1:-1).get().price);
		System.out.println();
		
		System.out.println(productsList.stream().filter(p->p.price<30).count());
		
		System.out.println(employees.stream().map(Employee::getName).sorted().collect(Collectors.toList()));
		
		System.out.println();
		
		System.out.println(employees.stream().collect(Collectors.toList()));
		
		
		
		
	}
}
