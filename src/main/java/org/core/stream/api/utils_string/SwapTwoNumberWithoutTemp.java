package org.core.stream.api.utils_string;

public class SwapTwoNumberWithoutTemp {
        // Declare a class named Swap

        public static void main(String[] args) {
            // Main method: starting point of the program

            int a = 5, b = 10;
            // Initialize two variables a = 5 and b = 10

            a = a + b;
            // Add both numbers and store in 'a'
            // Now a = 5 + 10 = 15

            b = a - b;
            // Subtract original b from new a
            // b = 15 - 10 = 5 (original value of a)

            a = a - b;
            // Subtract new b from a
            // a = 15 - 5 = 10 (original value of b)

            System.out.println("a=" + a + ", b=" + b);
            // Print swapped values → a=10, b=5
        }
    }
