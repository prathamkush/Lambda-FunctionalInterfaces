package com.predefinedFunctinalInterfaces;

import java.util.function.BiPredicate;

public class PredicateTest2_BiPredicate {
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
