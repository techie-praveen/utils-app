package org.core.stream.api.utils_string;
// Defines the package name where this class belongs

import java.util.stream.IntStream;
// Imports IntStream for using Java Streams on integers

public class PrimeCheck {
    // Declares a public class named PrimeCheck

    public static void main(String[] args) {
        // Main method: entry point of the Java program

        int number = 17;
        // Number to be checked for prime

        boolean isPrime = number > 1 &&
                // Ensures number is greater than 1 (since 0 and 1 are not prime)

                IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        // Creates a stream of numbers from 2 to square root of the number

                        .noneMatch(n -> number % n == 0);
        // Checks that NO number in the range divides 'number' evenly
        // If none divide it, then it is prime

        System.out.println(number + " is prime: " + isPrime);
        // Prints the result (true if prime, false otherwise)
    }
}