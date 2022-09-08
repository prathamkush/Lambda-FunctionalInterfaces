package com.predefinedFunctinalInterfaces;

import java.util.function.Consumer;

public class ConsumerAccept {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("Hello how are you?");

        Consumer<Integer> integerConsumer = i -> System.out.println("Integer Value = "+i);
        integerConsumer.accept(5);


        Consumer<String> emp1 = (arg) -> System.out.println("My name is Pratham "+ arg);
        Consumer<String> emp2 = (arg) -> System.out.println("I am from India "+arg);
        emp1.andThen(emp2).accept("Hello");


    }
}
