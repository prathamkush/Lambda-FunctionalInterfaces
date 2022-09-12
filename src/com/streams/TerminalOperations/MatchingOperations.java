package com.streams.TerminalOperations;

/*
Intermediate operations - Lazy operations, not executing immediately

*/

import com.predefinedFunctinalInterfaces.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.lang.*;


public class MatchingOperations {
    public static void main(String[] args) {
        // AnyMatch -> true, if an element exists
        //          -> false, if no element matches or empty stream

        // AllMatch -> true, if every element matches with the input
        //          -> true, if stream is empty
        //          -> false, any single element doesn't match criteria

        // NoneMatch-> true, if no element matches or empty stream
        //          -> false, if single element matches with criteria

        List<Person> stringList = new ArrayList<>();
        stringList.add(new Person("Alice",29,"India"));
        stringList.add(new Person("Bob",21,"UAE"));
        stringList.add(new Person("Carlos",18,"USA"));
        stringList.add(new Person("Dave",17,"UK"));
        stringList.add(new Person("Eve",16,"France"));

        // 1. Check if any person who belongs to India
        boolean anyIndian = stringList.stream().anyMatch(s -> s.getCountry().equals("India"));
        System.out.println(anyIndian);

        // 2. Check if all persons are less than the age of 30
        boolean allBelow30 = stringList.stream().allMatch(s -> s.age<30);
        System.out.println(allBelow30);

        // 3. Check if none of the person name starts with letter K
        boolean nameNotStartWithK = stringList.stream().noneMatch(s -> s.getName().charAt(0) == 'K');
        System.out.println(nameNotStartWithK);
        //or
        //boolean noneStartsWithK = stringList.stream().noneMatch(s->s.getName().substring(0,1).equals("K"));


    }
}
