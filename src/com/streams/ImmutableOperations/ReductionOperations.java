package com.streams.ImmutableOperations;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReductionOperations {

    // Reduce -> Collection of Objects -> Gives a Single Valued
    //           result which is Immutable

    // Identity -> Initial value of the operation -> default result
    //             -> when your stream is empty

    // Accumulator -> a,b -> a[partial result]+b [next element of the steam]
    // Combiner -> Types of accumulator implementation

    // 1. Optional<T> reduce(BinaryOperator<T>accumulator)

    public static void main(String[] args) {
        List<Person3> list = new ArrayList<>();
        list.add(new Person3("Alice",29,20000));
        list.add(new Person3("Bob",21,45456));
        list.add(new Person3("Carlos",18,23454));
        list.add(new Person3("Dave",17,54665));
        list.add(new Person3("Eve",16,45678));
        list.add(new Person3("Francis", 24,75635));

        Optional<Integer> totalSalary = list.stream().map(s -> s.getSalary()).reduce((p,q) -> p + q);

        if(totalSalary.isPresent()){
            System.out.println("The total salary of all people : "+totalSalary);
        }
        else{
            System.out.println("No Records found!!");
        }

        // 2. T reduce(T identity, BinaryOperator<T>accumulator)
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(7);
        list2.add(5);
        list2.add(1);
        list2.add(4);
        list2.add(8);

        int totalSalary1 = list2.stream().reduce(10, (p1, n) -> p1+n);
        System.out.println("Total sum is : "+totalSalary1);


        // 3.
        // 1 -> Stream -> 1.1 Stream -> 1.2 Stream -> 1.3 Stream
        // 123463264 + 33543754836443545435 + 3323

        // Sub streams -> Jan[Sub]-> no of days reduce -> Feb[sub] -> no of days reduce -> Mar[Sub] -> no of days reduce...
        int totalSalary2 = list2.parallelStream().reduce(2, (partialSum, num) -> partialSum+num, Integer::sum);
        // Integer::sum -> this sums identity also sums identity = 2 for 6 times (=12) since list2 length = 6
        System.out.println("Total sum of parallel streams : "+ totalSalary2);


        // 4. max and min
        Optional<Integer> maxNum = list2.stream().max(Comparator.reverseOrder());
        System.out.println("Max number in the list = "+maxNum);

        Optional<Integer> minNum = list2.stream().min(Comparator.reverseOrder());
        System.out.println("Min number in the list = "+minNum);






        //System.out.println((list.stream().map(s -> s.getSalary()).reduce((p,q) -> p - q)).getClass().getSimpleName());
        //System.out.println((list2.stream().reduce(10,(p1,n)->p1+n)).getClass().getSimpleName());

    }
}


class Person3 {
    String name;
    int age;
    int salary;


    Person3(String name){
        this.name = name;
    }

    public Person3(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return "Person2{"+
                "name = '" + name + '\'' +
                ", age = "+ age +
                ", salary = "+ salary +
                '}';
    }

}