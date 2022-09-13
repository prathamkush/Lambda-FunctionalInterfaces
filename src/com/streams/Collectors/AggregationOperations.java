package com.streams.Collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregationOperations {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Bob",21,45456,"UAE"));
        list.add(new Employee("Francis", 24,75635,"USA"));
        list.add(new Employee("Alice",12,20000, "India"));
        list.add(new Employee("Dave",17,54665,"USA"));
        list.add(new Employee("Carlos",18,23454,"UK"));
        list.add(new Employee("Eve",35,45678,"JAPAN"));

        // Counting
        long count = list.stream().filter(emp -> emp.getAge() > 18).collect(Collectors.counting());
        System.out.println("Count of employess > 18 : "+count);

        // Summing
        long sumSalary = list.stream().collect(Collectors.summingLong(emp -> emp.getSalary()));
        System.out.println("Sum Salary : "+sumSalary);

        // ToIntFunction
        double averageSalary = list.stream().collect(Collectors.averagingInt(emp -> emp.getSalary()));
        System.out.println("Average Salary : "+averageSalary);

        double intAverageSalary = list.stream().collect(Collectors.averagingLong(emp -> emp.salary));
        System.out.println("Average Salary(int) : "+intAverageSalary);

        // minBy
        Optional<Employee> minSalary = list.stream().filter(emp -> emp.getAge()>18).collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Min Salary : "+minSalary);

        // maxBy
        Optional<Employee> maxSalary = list.stream().filter(emp -> emp.getAge()>18).collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Max Salary : "+maxSalary);

        // Joining
        String joinAString = Stream.of("I am", "Alice").collect(Collectors.joining(" "));
        System.out.println(joinAString);

        // Joining all names to a string
        String allNames = list.stream().map(emp -> emp.getName()).collect(Collectors.joining(" "));
        System.out.println("all names : "+allNames);
    }
}

class Employee {
    String name;
    int age;
    int salary;

    String country;

    Employee(String name){
        this.name = name;
    }

    public Employee(String name, int age, int salary, String country){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString(){
        return "Employee{"+
                "name = '" + name + '\'' +
                ", age = "+ age +
                ", country = "+ salary +
                '}';
    }

}
