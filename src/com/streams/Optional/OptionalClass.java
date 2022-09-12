package com.streams.Optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;

public class OptionalClass {
    Map<Integer, Person1> personMap = new HashMap<>();

    /*
    public Person1 getPerson(Integer personId){
        return personMap.get(personId);
    }*/

    public Optional<Person1> getPerson(Integer personId){
        return Optional.ofNullable(personMap.get(personId));
    }


    public static void main(String[] args) {
        OptionalClass check = new OptionalClass();

        // 1 2





        //Some Person with some ID
        Optional<Person1> obj1 = check.getPerson(32);

        if(obj1.isPresent()){
            System.out.println(obj1.get().getName());
        }
        else{
            System.out.println("No Person found with that ID");
        }
    }

}


class Person1 {
    public String name;
    public int age;
    public String country;


    Person1(String name){
        this.name = name;
    }

    public Person1(String name, int age, String country){
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
        return "Person1{"+
                "name = '" + name + '\'' +
                ", age = "+ age +
                ", country = "+ country +
                '}';
    }

}

