package org.core.stream.api.utils_string;

import java.util.*;
import java.util.stream.*;

public class MissingNumbers {
    public static void main(String[] args) {

        // Input array (some numbers missing in range 1 to n)
        int[] arr = {1, 2, 4, 6, 7};

        // Define the expected range (1 to n)
        int n = 7;

        // Step 1: Convert array to Set for fast lookup (O(1) contains check)
        Set<Integer> set = IntStream.of(arr)   // Convert array to IntStream
                .boxed()  // Convert int -> Integer (required for Set)
                .collect(Collectors.toSet()); // Collect into Set

        // Step 2: Iterate from 1 to n and filter missing numbers
        List<Integer> missing = IntStream.rangeClosed(1, n) // Stream from 1 to n (inclusive)
                .filter(i -> !set.contains(i)) // Keep numbers NOT in set
                .boxed() // Convert int -> Integer for List
                .toList(); // Collect into List

        // Step 3: Print the result
        System.out.println("Missing numbers: " + missing);
    }
}