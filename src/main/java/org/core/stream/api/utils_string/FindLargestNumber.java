package org.core.stream.api.utils_string;

import java.util.Arrays;

public class FindLargestNumber {
        public static void main(String[] args) {

            int[] arr = {10, 25, 7, 89, 45};
            // Input array

            int max = Arrays.stream(arr)
                    // Convert array to IntStream

                    .max()
                    // Find maximum value in the stream

                    .getAsInt();
            // Extract int value from OptionalInt

            IO.println("Largest: " + max);
            // Print the largest element
        }
    }
