package com.predefinedFunctinalInterfaces;


import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

    public static void main(String[] args) {
        Person person = new Person();

        UnaryOperator<Person> uo = (p) -> {
            p.name = "Frodo";
            p.age = 22;
            p.country = "Shire";
            return p;
        };
        uo.apply(person);
        System.out.println("Person Name : "+person.getName() + "Person Age : "+ person.getAge());

    }
}
