package org.core.stream.api.utils_string;


// Java Program to move all negative numbers to the start of array and positive numbers to end

import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveNegatives {
    public static void main(String[] args) {

        int[] arr = {3, -2, 5, -7, 1, -4};
        // Input array

        int[] result = IntStream.concat(
                        Arrays.stream(arr)
                                .filter(n -> n < 0),
                        // Stream 1: filter only negative numbers

                        Arrays.stream(arr)
                                .filter(n -> n >= 0)
                        // Stream 2: filter zero and positive numbers
                )
                // Concatenate both streams → negatives first, then positives

                .toArray();
        // Convert final stream back to array

        System.out.println(Arrays.toString(result));
        // Print result → negatives at beginning, positives at end
    }
}