package com.streams.Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingOperations {

    public static void main(String[] args) {
        // Grouping
        List<GroupEmployee> list = new ArrayList<>();

        list.add(new GroupEmployee("Bob",21,45456,"India"));
        list.add(new GroupEmployee("Francis", 24,75635,"USA"));
        list.add(new GroupEmployee("Alice",12,20000, "India"));
        list.add(new GroupEmployee("Dave",17,54665,"USA"));
        list.add(new GroupEmployee("Carlos",18,23454,"UK"));
        list.add(new GroupEmployee("Eve",35,45678,"USA"));
        list.add(new GroupEmployee("George",40,89678,"France"));


        // GroupBy
        Map<String, List<GroupEmployee>> employeeMap = list.stream().collect(Collectors.groupingBy(GroupEmployee::getCountry));
        System.out.println(employeeMap);

        // GroupBy downstream
        Map<String, Optional<GroupEmployee>> empMapbyMaxSalary = list.stream().collect(Collectors.groupingBy(GroupEmployee::getCountry,Collectors.maxBy(Comparator.comparingInt(GroupEmployee::getSalary))));
        System.out.println(empMapbyMaxSalary);

    }
}


class GroupEmployee {
    String name;
    int age;
    int salary;

    String country;

    GroupEmployee(String name){
        this.name = name;
    }

    public GroupEmployee(String name, int age, int salary, String country){
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
        return "GroupEmployee{"+
                "name = '" + name + '\'' +
                ", age = "+ age +
                ", country = "+ salary +
                '}';
    }

}