package org.core.stream.api.utils_string;

import java.util.Arrays;

public class RemoveDuplicateFromList {
    static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};
// Original array with duplicates

        int[] result = Arrays.stream(arr)
                // Convert array to IntStream

                .distinct()
                // Remove duplicate elements

                .toArray();
        // Convert stream back to array

        System.out.println(Arrays.toString(result));
// Print result → [1, 2, 3, 4, 5]
    }
}
