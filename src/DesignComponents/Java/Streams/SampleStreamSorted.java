package DesignComponents.Java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The sorted method is used to sort the stream.
 *
 * Link - https://www.geeksforgeeks.org/stream-in-java/
 */
public class SampleStreamSorted {

    public static void main(String[] args) {

        // create a list of strings
        List<String> strings = Arrays.asList("Anshul", "Agrawal", "Developer");

        // Sort the list
        List<String> sorted = strings.stream().sorted().collect(Collectors.toList());

        System.out.println(sorted);
    }
}
