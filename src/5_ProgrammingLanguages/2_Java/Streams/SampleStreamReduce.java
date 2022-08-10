package DesignComponents.Java.Streams;

import java.util.Arrays;
import java.util.List;

/**
 * The reduce method is used to reduce the elements of a stream to a single value.
 *
 * Link - https://www.geeksforgeeks.org/stream-in-java/
 */
public class SampleStreamReduce {

    public static void main(String[] args) {

        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // Filter even elements & then sum the elements.
        int sumEvenNumbers = number.stream().filter(x->x%2 == 0).reduce(0,(ans,i) -> ans+i);

        System.out.println(sumEvenNumbers);


    }
}
