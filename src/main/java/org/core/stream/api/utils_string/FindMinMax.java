package org.core.stream.api.utils_string;

import java.util.Arrays;
import java.util.OptionalInt;

import static org.core.stream.api.LoggerUtil.getMethodName;

public class FindMinMax {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 3, 15}; // Sample array of integers
        findMinMax(numbers); // Call the method to find min and max
    }

    public static void findMinMax(int[] numbers) {
        IO.println(getMethodName()); // Print the method name for logging
        // Convert the array to an IntStream for stream operations
        OptionalInt min = Arrays.stream(numbers) // Create IntStream from array
                .min(); // Find the minimum value
        OptionalInt max = Arrays.stream(numbers) // Create IntStream from array
                .max(); // Find the maximum value
        // Check if min and max are present and print them
        if (min.isPresent() && max.isPresent()) { // Ensure the array is not empty
            System.out.println("Smallest number: " + min.getAsInt()); // Print the smallest number
            System.out.println("Largest number: " + max.getAsInt()); // Print the largest number
        } else {
            System.out.println("Array is empty"); // Handle empty array case
        }
    }
}
