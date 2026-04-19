package org.core.stream.api.utils_string;

import java.util.stream.IntStream;

import static org.core.stream.api.LoggerUtil.getMethodName;

public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid
        printPyramid(rows); // Call the method to print the pyramid
    }

    public static void printPyramid(int rows) {
        IO.println(getMethodName()); // Print the method name for logging
        // Use IntStream to generate rows, map each to a string of spaces and stars, then print
        IntStream.rangeClosed(1, rows) // Generate stream of row numbers from 1 to rows
                .mapToObj(i -> { // For each row i, create the string representation
                    int spaces = rows - i; // Calculate number of leading spaces for this row
                    String spaceStr = " ".repeat(spaces); // Create string of spaces
                    int stars = 2 * i - 1; // Calculate number of stars for this row (odd number)
                    String starStr = "*".repeat(stars); // Create string of stars
                    return spaceStr + starStr; // Combine spaces and stars into the row string
                })
                .forEach(System.out::println); // Print each row string on a new line
    }
}
