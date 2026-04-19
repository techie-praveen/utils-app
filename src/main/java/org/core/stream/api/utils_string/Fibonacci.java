package org.core.stream.api.utils_string;

import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 10;
        // Number of Fibonacci terms to print

        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                // Start with {0,1} → represents first two Fibonacci numbers
                // Each step: next pair → {b, a+b}

                .limit(n)
                // Limit the stream to 'n' elements

                .forEach(t -> IO.print(t[0] + " "));
        // Print first element of each pair → Fibonacci sequence
    }
}