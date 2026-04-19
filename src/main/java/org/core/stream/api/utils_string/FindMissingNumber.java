package org.core.stream.api.utils_string;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.core.stream.api.LoggerUtil.getMethodName;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10}; // Sample array with multiple missing numbers (3,5,7,9 are missing)
        int n = 10; // Total numbers from 1 to n
        List<Integer> missing = findMissing(arr, n); // Find the missing numbers
        System.out.println("Missing numbers: " + missing); // Print the result
    }

    public static List<Integer> findMissing(int[] arr, int n) {
        IO.println(getMethodName()); // Print the method name for logging
        // Convert array to a set for O(1) lookup
        Set<Integer> set = Arrays.stream(arr) // Convert array to IntStream
                .boxed() // Box to Integer stream
                .collect(Collectors.toSet()); // Collect into a set
        // Find numbers from 1 to n that are not in the set
        return IntStream.rangeClosed(1, n) // Generate IntStream from 1 to n
                .filter(i -> !set.contains(i)) // Filter out numbers present in the set
                .boxed() // Box to Integer stream
                .collect(Collectors.toList()); // Collect into a list of missing numbers
    }
}
