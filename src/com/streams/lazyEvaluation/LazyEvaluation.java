package com.streams.lazyEvaluation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluation {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,2,3,4,5,6,7,8);

        // Sequential Stream
        Optional<Integer> numbers = data.stream()
                .filter(num -> {
                    System.out.println("Processing filter for greater num = "+num);
                    return num > 3;
                })
                .filter(num -> {
                    System.out.println("Processing filter for even num = "+num);
                    return num%2 == 0;
                })
                .findAny();  //terminal operation

        System.out.println(numbers.get());
        // Pick the first element  =    1 -> it is greater than 3
        // Pick the second element =    2 -> it is greater than 3
        // Pick the third element  =    3 -> it is greater than 3
        // Pick the fourth element =    4 -> it is greater than 3
        // Pick the fifth element  =    5 -> it is greater than 3


        System.out.println("----------");

        data.stream()
                .filter(num -> {
                    System.out.println("Processing filter for greater num = "+num);
                    return num > 3;
                })
                .filter(num -> {
                    System.out.println("Processing filter for even num = "+num);
                    return num%2 == 0;
                }).forEach(System.out::println);

        System.out.println("----------------PARALLEL------------------------");


        // Parallel Stream

        Optional<Integer> numberss = data.parallelStream()
                .filter(num -> {
                    System.out.println("Processing filter for greater num = "+num);
                    return num > 3;
                })
                .filter(num -> {
                    System.out.println("Processing filter for even num = "+num);
                    return num%2 == 0;
                })
                .findAny();  //terminal operation

        System.out.println(numberss.get());


        System.out.println("-------------");

        Stream<Integer> temp = data.parallelStream()
                .filter(num -> {
                    System.out.println("Processing filter for greater num = "+num);
                    return num > 3;
                })
                .filter(num -> {
                    System.out.println("Processing filter for even num = "+num);
                    return num%2 == 0;
                }); //.forEach(System.out::println);


        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println(temp.collect(Collectors.toList()));
    }


}
