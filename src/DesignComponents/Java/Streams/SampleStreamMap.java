package DesignComponents.Java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The map method is used to return a stream consisting of the results of applying the given function to the elements of this stream.
 *
 * Link - https://www.geeksforgeeks.org/stream-in-java/
 */
public class SampleStreamMap {

    public static void main(String[] args) {

        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // Apply x->x*x on number list. List as an output.
        List<Integer> outputList = number.stream().map(x -> x*x).collect(Collectors.toList());

        // Apply x->x*x on number list. Set as an output.
        Set<Integer> outputSet = number.stream().map(x -> x*x).collect(Collectors.toSet());

        System.out.println(outputList);
    }
}
