package com.java.java8;

import java.io.Serializable;

public class Employee implements Serializable{
    private int id;
    private String name;
    private int departmentId;
    private int salary;

    // Constructor
    public Employee(int id, String name, int departmentId,int salary) {
        this.id = id;
        this.name = name;
        this.departmentId = departmentId;
        this.salary=salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }
    
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', departmentId=" + departmentId + ", salary =" +salary+ "}";
    }
    
    // Method to increment salary
    public void incrementSalary(double percentage) {
       this.salary+=this.salary*percentage/100;
    }

}

class Department {
    private int id;
    private String name;

    // Constructor
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Department{id=" + id + ", name='" + name + "'}";
    }
}

