package org.core.stream.api.utils_string;


public class VowelsCount {
    public static void main(String[] args) {

        String str = "Hello World";
        // Input string

        long count = str.toLowerCase()
                // Convert string to lowercase to handle uppercase vowels

                .chars()
                // Convert string to IntStream of character ASCII values

                .filter(c -> "aeiou".indexOf(c) != -1)
                // Keep only characters that are vowels (a, e, i, o, u)

                .count();
        // Count the number of vowels

        IO.println("Vowels: " + count);
        // Print total vowel count
    }
}