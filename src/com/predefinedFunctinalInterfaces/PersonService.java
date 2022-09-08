package com.predefinedFunctinalInterfaces;
import java.util.Collections;
import java.util.List;

public class PersonService {

    public static List<Person> getPersons(List<Person> persons){
        /*// a sort of lambda func
        // c.sort(obj, lambda)
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getCountry().compareTo(o2.getCountry());
            }
        });*/
        // functionalInterfaces (used directly)
        //sorting based on country
        Collections.sort(persons, (o1,o2) -> o1.getCountry().compareTo(o2.getCountry()));

        return persons;
    }
}
