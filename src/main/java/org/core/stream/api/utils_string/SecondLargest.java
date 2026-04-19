package org.core.stream.api.utils_string;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 8, 25, 15);
        Integer secondLargest = numbers.stream()
                .distinct() // remove duplicates
                .sorted((a, b) -> b - a) // sort in descending order
                .skip(1) // skip the largest
                .findFirst() // get the second largest
                .orElse(null); // handle empty case
        System.out.println("Second Largest: " + secondLargest);
    }
}