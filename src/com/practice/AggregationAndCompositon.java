package com.practice;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String name;
    private List<Employee> employees;
    public Department (String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){

        employees.add(employee);
    }
}

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name=name;
        this.id=id;
    }

}

class Car {
    private Engine engine;

    public Car(){
        engine = new Engine();
    }
}

class Engine{

}

public class AggregationAndCompositon {
    public static void main(String[] args){
//        System.out.println("hello world");

        int i;
        Employee e1 = new Employee("prashant",123);
        Employee e2 = new Employee("ankesh", 234);

        Department d = new Department("Engineering");

        d.addEmployee(e1);
        d.addEmployee(e2);
    }
}
