package com.predefinedFunctinalInterfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Supplierget2 {
    static boolean isPersonEligibleForVoting(Supplier<Person> supplier, Predicate<Person> predicate){
        return predicate.test(supplier.get());
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Pratham",22,"India"));
        persons.add(new Person("Shashank",61,"USA"));
        persons.add(new Person("Manish",18,"Mexico"));
        persons.add(new Person("Shubham",14,"China"));
        persons.add(new Person("Alice",77,"India"));

        //TO-DO here: Do this by creating a supplierlist

        for(Person pp : persons){

            Supplier<Person> supplier = () -> pp;

            Predicate<Person> predicate = (p) -> p.getAge() >= 18;

            boolean eligible = isPersonEligibleForVoting(supplier,predicate);

            System.out.println("Person is eligible for voting?? : "+pp.getName() +" "+eligible);
        }
    }
}
