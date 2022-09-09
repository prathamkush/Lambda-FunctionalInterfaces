package com.streams.IntermediateOperations;

import java.util.ArrayList;
import java.util.List;

public class FilteringOperations {
    static Boolean func(Integer i){
        if(i<100){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // List of Integers
        List<Integer> intList = new ArrayList<>();
        intList.add(12);
        intList.add(23);
        intList.add(1);
        intList.add(2);

        intList.stream().filter(s -> s > 2 && s<20 && func(s)==true).forEach(System.out::println);

        System.out.println("Checking the Original Data Structure ");
        intList.stream().forEach(System.out::println);
    }
}
