package DesignComponents.Java.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The filter method is used to select elements as per the Predicate passed as argument.
 *
 * Link - https://www.geeksforgeeks.org/stream-in-java/
 */
public class SampleStreamFilter {

    public static void main(String[] args) {

        // create a list of strings
        List<String> strings = Arrays.asList("Anshul", "Agrawal", "Developer");

        // Filter list for string starting with "A".
        // Here s->s.startsWith is the predicate.
        List<String> filtered = strings.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());

        System.out.println(filtered);
    }
}
