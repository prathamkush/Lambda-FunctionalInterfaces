package com.predefinedFunctinalInterfaces;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.swing.*;
import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest2 {
    static boolean isPersonEligibleForVoting(Person person, Integer minage, BiPredicate<Person,Integer> predicate){
        return predicate.test(person, minage);
    }

    public static void main(String[] args) {

        Person person = new Person("Pratham",18,"India");

        boolean eligible =
                isPersonEligibleForVoting(
                        person,
                        18,
                        (p,minage) -> {
                            return p.getAge() >= minage;
                        } //Function boolean call
                );

        System.out.println("Person is eligible for voting: "+ eligible);

    }
}
