package com.oetp;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List<Integer> intas= Arrays.asList(3,5,3,5,6,2,4);


        Function<String, Integer> parser = Integer::parseInt;

        System.out.println(parser.apply("3"));

        Set<Integer> unique=intas.stream().collect(Collectors.toSet());

        int sum= intas.stream().mapToInt(a -> a).sum();

        List<String> values= Arrays.asList("R Bhanu","Chowdary","Prakash R","Anand","aa","a","aaa","asss","Martin Scorcese");

        Map<String,Integer> length=values.stream().collect(Collectors.toMap(key->key, String::length));
//        System.out.println(length);

//        values.sort(Comparator.comparing((s,d)));
        System.out.println(values);
        values.sort(Comparator.comparing(s -> s.charAt(s.length()-1)));

        System.out.println(values);

        MyPredicate<Integer> evenFiler= (a)-> a%2==0;

        if(!evenFiler.test(5)){
            System.out.println("Its not Even numbre");
        }


        System.out.println(Filter.filter(intas,evenFiler));

        System.out.println(Filter.filter(values,s -> s.length()>6));

        int sums=intas.stream().filter(v-> v%2==0).mapToInt(s->s).sum();


        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Bhanu","IT",25000));
        employees.add(new Employee("Prakash","Sales",30000));
        employees.add(new Employee("Chowdary","Finance",20000));
        employees.add(new Employee("Ravilla","HR",45000));
        employees.add(new Employee("R.B.CHOWDARY","Admin",35000));
        employees.add(new Employee("R Bhanuprakash","Product",40000));
        employees.add(new Employee("Bhanuprakash Chowdary","Support",18000));
        employees.add(new Employee("Ravilla Bhanuprakash","Others",70000));
        employees.add(new Employee("Bhanu12","Others",77000));
        employees.add(new Employee("Bhanu123","Others",80000));
        employees.add(new Employee("Bhanu1234","Others",90000));
        employees.add(new Employee("Bhanu","IT",25000));
        employees.add(new Employee("VISHNU","IT",27000));
        employees.add(new Employee("Praveen","IT",55000));
        employees.add(new Employee("Anoop","Product",124000));
        employees.add(new Employee("Vaimitra","HR",73000));
        employees.add(new Employee("sunitha","IT",26000));
        employees.add(new Employee("sunitha","IT",26000));


        SalaryProcessor bonusProcessor = s -> s * 2;

        System.out.println("Printing incremented");
        employees.stream().map(e->new Employee(e.getName(),e.getDepartment(),bonusProcessor.process(e.getSalary()))).forEach(System.out::println);

//        Map<String,String> salHighByDept= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(e->e.getSalary()))));


        Predicate<Employee> sal= t->t.getSalary()>30000;
        Function<Employee,String> upper = employee -> employee.getName().toUpperCase();
        Consumer<String> print = System.out::println;

        employees.stream().filter(sal).map(upper).forEach(print);


        List<List<String>> names = Arrays.asList(
                Arrays.asList("Ravi", "Bhanu"),
                Arrays.asList("Kiran", "Teja")
        );

        names.stream().flatMap(Collection::stream).toList();


        List<String> items = Arrays.asList("Pen", "Pencil", "Pen", "Notebook");

        Set<Integer> sa=employees.stream().map(Employee::getSalary).collect(Collectors.toSet());

        String valuess="Bhanu Prakash";

        Optional<String> opt=Optional.of(valuess);

        List<String> collect = opt.stream().collect(Collectors.toList());

        System.out.println(collect);


        Map<String,Double> noOfEmployees=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingInt(Employee::getSalary)));

        System.out.println(noOfEmployees);

        List<String> greaterThan70k= employees.stream().filter(e-> e.getSalary()>120000).map(Employee::getName).toList();
        List<String> onlyNames = employees.stream().map(Employee::getName).toList();
        Map<String,List<String>> byDept=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName,Collectors.toList())));

        int highest3rdSalary=employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).mapToInt(Employee::getSalary).limit(1).findFirst().orElseThrow(() -> new RuntimeException("No Enough Empylyee"));

        System.out.println(highest3rdSalary);
        System.out.println(onlyNames);

        System.out.println(greaterThan70k);
        System.out.println(byDept);



        Map<String, String> empDept = employees.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getDepartment,(a,b)->b));
        System.out.println(empDept);

        BiFunction<String,Integer,String> repeat = (s, n) -> s.repeat(n);



        Stream<String> s = Stream.of("A","B","C");
        List<String> uppers = s.map(String::toUpperCase)
                .toList();


        String name="Bhanu prakash CHwoedary";
        List<String> split= Arrays.stream(name.split(" ")).toList();


        Stream.of(1, 2, 3, 4)
                .filter(i -> {
                    System.out.println("Filtering: " + i);
                    return i % 2 == 0;
                })
                .map(i -> i * 2).forEach(System.out::println);

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        System.out.println(list);

        System.out.println("ENDING");
    };
}

@FunctionalInterface
interface SalaryProcessor {
    int process(int salary);
}



class Employee{

    private String name;
    private String department;
    private Integer salary;

    public Employee(String name, String department, Integer salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

interface MyPredicate<T>{
    boolean test(T t);
}

class Filter{

    public static <T> List<T> filter(List<T> input,MyPredicate<T> filer){
        List<T> result = new ArrayList<>();
        for(T t:input){
            if(filer.test(t)){
                result.add(t);
            }
        }
        return result;
    }

    public static <T> List<? extends Number> printList(List<? extends Number> df){
        return new ArrayList<>();
    }
}

