package com.streams.Collectors.CollectionsOperations;


import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashMap;

public class CollectionOperations {
    public static void main(String[] args) {
        // 1. Collect Method
        List<Person4> list = new ArrayList<>();


        list.add(new Person4("Bob",21,45456,"UAE"));
        list.add(new Person4("Francis", 24,75635,"USA"));
        list.add(new Person4("Alice",29,20000, "India"));
        list.add(new Person4("Dave",17,54665,"USA"));
        list.add(new Person4("Carlos",18,23454,"UK"));
        list.add(new Person4("Eve",16,45678,"JAPAN"));


        // toList
        List<String> allNames = list.stream().map(person -> person.getName()).collect(Collectors.toList());
        System.out.println("List of names "+allNames);

        // toSet
        Set<String> countryName = list.stream().map(p -> p.getCountry()).collect(Collectors.toSet());
        System.out.println("Set of Country names : "+countryName);

        // Linked List
        LinkedList<String> namePerson = list.stream().map(s -> s.getName()).collect(Collectors.toCollection(LinkedList::new));
        System.out.println("LinkedList of names : "+namePerson);

        // TreeSet
        TreeSet<String> nameOfPerson = list.stream().map(s -> s.getName()).collect(Collectors.toCollection(TreeSet::new));
        System.out.println("TreeSet of names : "+nameOfPerson);

        // Map
        Map<String, Integer> personMap = list.stream().collect(Collectors.toMap(s -> s.getName(), s -> s.getName().length()));
        System.out.println("Map of names and their lengths : "+personMap);

        // Downstream
        List<String> notChangableList = list.stream().map(s-> s.getName()).collect(Collectors.collectingAndThen(Collectors.toList(),Collections::unmodifiableList));
        System.out.println("Not changable list : "+notChangableList);

    }
}

class Person4 {
     String name;
     int age;
     int salary;

     String country;





    Person4(String name){
        this.name = name;
    }

    public Person4(String name, int age, int salary, String country){
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
        return "Person4{"+
                "name = '" + name + '\'' +
                ", age = "+ age +
                ", country = "+ salary +
                '}';
    }

}
