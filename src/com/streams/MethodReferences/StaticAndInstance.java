package com.streams.MethodReferences;

import java.util.ArrayList;
import java.util.List;

public class StaticAndInstance {

    public static int getLength(String str){
        return str.length();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Alice");
        list.add("Bob");
        list.add("Carol");
        list.add("Dave");

        StaticAndInstance obj1 = new StaticAndInstance();

        list.stream().map(s -> s.length()).forEach(System.out::println);
        System.out.println("---------");

        //General Static Method
        list.stream().map(s -> StaticAndInstance.getLength(s)).forEach(System.out::println);

        System.out.println("----------");

        //Static Method References
        list.stream().map(StaticAndInstance::getLength).forEach(System.out::println);

        //General Instance Based Method
        list.stream().mapToInt(s -> obj1.getLength(s)).forEach(System.out::println);

        //Instance based Method Reference
        //list.stream();



    }
}
