package com.streams.IntermediateOperations;


import sun.rmi.transport.StreamRemoteCall;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MappingOperations2 {

    //Array of strings, return a new array of strings that includes those characters > 5
    // and change all of the array of string to uppercase
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("Pratham",   "Aman", "Akshay"));


        Stream<String> stream = l1.stream().filter(s -> s.length() > 5).map(s -> s.toUpperCase());
        ArrayList<String> l2 = stream.collect(Collectors.toCollection(ArrayList::new));

        System.out.println(l2);


        //getting data type of length
        l1.stream().map(s -> s.length()).map(Object -> Object.getClass().getSimpleName()).forEach(System.out::println);


        // Mapping List form Strings to Integers
        l1.stream().map(s -> s.length()).toArray();


        // List of List of Strings
        List<List<String>> l3 = new ArrayList<>();
        l3.add(Arrays.asList("a","b","c"));
        l3.add(Arrays.asList("d","a","f"));
        l3.add(Arrays.asList("g","h","a"));

        Stream<List<String>> normalStream = l3.stream();

        //Flattening Stream
        Stream<String> flattenedStream = normalStream.flatMap(s -> s.stream());

        //Filter Operation
        Stream<String> streamFiltered = flattenedStream.filter(s -> "a".equals(s));

        //finalPrinting
        streamFiltered.forEach(System.out::println);


    }
}
