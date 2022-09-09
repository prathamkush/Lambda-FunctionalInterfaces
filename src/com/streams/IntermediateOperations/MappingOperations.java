package com.streams.IntermediateOperations;

import java.util.ArrayList;
import java.util.List;

public class MappingOperations {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(12);
        intList.add(23);
        intList.add(1);
        intList.add(2);
        intList.add(10);
        intList.add(5);
        intList.add(13);

        intList.stream().map(s -> s*2).forEach(System.out::println);

        System.out.println(intList);

    }
}
