package com.predefinedFunctinalInterfaces;

public class Person {
     public String name;
     public int age;
     public String country;


    Person(){

    }

    public Person(String name, int age, String country){
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


}
