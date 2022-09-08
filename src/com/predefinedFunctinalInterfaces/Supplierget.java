package com.predefinedFunctinalInterfaces;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Supplierget {
    static boolean isPersonEligibleForVoting(Supplier<Person> supplier, Predicate<Person> predicate){
        return predicate.test(supplier.get());
    }

    public static void main(String[] args) {

        Supplier<Person> supplier = () -> new Person("Pratham",22,"India");

        Predicate<Person> predicate = (p) -> p.getAge() >= 18;

        boolean eligible = isPersonEligibleForVoting(supplier,predicate);

        System.out.println("Person is eligible for voting?? : "+eligible);

    }
}
