package com.streams.ParallelStreams;

import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        System.out.println("Printing General Stream");
        Stream.of(1,2,3,4,5,6,7)
                .forEach(num -> System.out.println(num+""+Thread.currentThread().getName()));

        System.out.println("Parallel Stream");
        Stream.of(1,2,3,4,5,6,7)
                .parallel()
                .forEach(num -> System.out.println(num+""+Thread.currentThread().getName()));

        // When to Run Parallel Streams?
        //  1.  Splitting is not more expensive than doing the work.
        //  2.  Task dispatch/management costs between the threads is not too high
        //  3.  The Result combination cost must not be high
        //  4.  Go for multithreading if :
        //      NQ Formula -> N * Q <(should not be greater than) 10000
        //      N = no of data items
        //      Q = Amount of work per item
        // 50 lakh elements -> 20k ele -> 1 split -> total 250 splits

    }

}
