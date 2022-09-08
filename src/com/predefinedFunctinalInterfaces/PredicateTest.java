package com.predefinedFunctinalInterfaces;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    static boolean isPersonEligibleForVoting(Person person, Predicate<Person> predicte){
        return predicte.test(person);
    }
    static boolean isPersonEligibleForRetirement(Person person, Predicate<Person> predicte){
        return predicte.test(person);
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Pratham",22,"India"));
        persons.add(new Person("Shashank",61,"USA"));
        persons.add(new Person("Manish",18,"Mexico"));
        persons.add(new Person("Shubham",14,"China"));
        persons.add(new Person("Alice",77,"India"));

        for(Person ppp : persons){
            Predicate<Person> pred1 = pp -> pp.getAge() > 18;
            boolean eligibleToVote = isPersonEligibleForVoting(ppp, pred1);
            System.out.println("Person is eligible for voting?? Ans : "+eligibleToVote);
        }

        for(Person ppp : persons){
            Predicate<Person> pred2 = pp -> pp.getAge() > 60;
            boolean eligibleToRetire = isPersonEligibleForRetirement(ppp, pred2);
            System.out.println("Person is eligible for retirement?? Ans : "+eligibleToRetire);
        }

    }
}
