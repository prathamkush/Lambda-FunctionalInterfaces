package com.streams.IntermediateOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class SlicingOperations {
    public static void main(String[] args) {
        // Distinct Method -> Remove duplicates
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList(
                "Pratham", "Aman", "Akshay","Aman","Bhavya","Akshay"));

        stringList.stream().distinct().forEach(System.out::println);
        System.out.println("------------");

        // Limit
        stringList.stream().distinct().limit(2).forEach(System.out::println);
        System.out.println("------------");

        // Skip - skips first n elements
        stringList.stream().distinct().limit(3).skip(2).forEach(System.out::println);
    }
}
