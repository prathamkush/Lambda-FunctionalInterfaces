package com.streams.TerminalOperations;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingOperations {
    public static void main(String[] args) {

        List<Person2> list = new ArrayList<>();
        list.add(new Person2("Alice",29,"India"));
        list.add(new Person2("Bob",21,"UAE"));
        list.add(new Person2("Carlos",18,"USA"));
        list.add(new Person2("Dave",17,"UK"));
        list.add(new Person2("Eve",16,"France"));
        list.add(new Person2("Francis", 24,"UK"));

        Optional<Person2> p = list.stream().filter(s -> s.getCountry().equals("UK")).findAny();

        System.out.println("hasdsafd");
        System.out.println(list.stream().filter(s -> s.getCountry().equals("UK")).findAny());
        System.out.println("-----");
        if(p.isPresent()){
            System.out.println(p);
        }
        else{
            System.out.println();
        }
    }
}

class Person2 {
    public String name;
    public int age;
    public String country;


    Person2(String name){
        this.name = name;
    }

    public Person2(String name, int age, String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString(){
        return "Person2{"+
                "name = '" + name + '\'' +
                ", age = "+ age +
                ", country = "+ country +
                '}';
    }

}
