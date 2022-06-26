package DesignComponents.Java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The forEach method is used to iterate through every element of the stream.
 *
 * Link - https://www.geeksforgeeks.org/stream-in-java/
 */
public class SampleStreamForEach {

    public static void main(String[] args) {

        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // Apply x->x*x on number list & then print it
        number.stream().map(x -> x*x).forEach(y->System.out.println(y));
    }
}
