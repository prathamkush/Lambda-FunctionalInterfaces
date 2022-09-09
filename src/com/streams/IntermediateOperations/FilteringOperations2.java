package com.streams.IntermediateOperations;

import com.predefinedFunctinalInterfaces.Person;

import java.util.ArrayList;

public class FilteringOperations2 {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Pratham",22,"India"));
        persons.add(new Person("Shashank",61,"USA"));
        persons.add(new Person("Manish",18,"Mexico"));
        persons.add(new Person("Shubham",14,"China"));
        persons.add(new Person("Alice",77,"India"));

        //people > 18
        System.out.println("Voting people  : ");
        persons.stream().filter(s -> s.getAge()>18).forEach(s -> System.out.println(s.getName()+" "+s.getAge()));

        //people > 60
        System.out.println("Retirement people : ");
        persons.stream().filter(s -> s.getAge()>60 && s.getCountry().equals("India")).forEach(s -> System.out.println(s.getName()+" "+s.getAge()));
        //or
        //persons.stream().filter(p -> p.getAge()>60).filter(p -> p.getCountry().equals("India")).forEach(s -> System.out.println(s.getName()+", Age:"+s.getAge()));



    }
}
