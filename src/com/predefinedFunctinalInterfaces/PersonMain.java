package com.predefinedFunctinalInterfaces;

import java.util.ArrayList;
import java.util.List;


public class PersonMain {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Pratham",22,"India"));
        persons.add(new Person("Shashank",23,"USA"));
        persons.add(new Person("Manish",24,"Mexico"));
        persons.add(new Person("Shubham",22,"China"));

        // getPerson func in service

        List<Person> sortedPersons = PersonService.getPersons(persons);
        System.out.println("Persons after sorting : ");

        //sorted by Person country
        for(Person aperson : sortedPersons){
            System.out.println("Person country "+ aperson.getCountry());
        }
    }
}
