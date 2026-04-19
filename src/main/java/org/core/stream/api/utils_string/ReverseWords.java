package org.core.stream.api.utils_string;
//How to reverse words in String in java

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

public class ReverseWords {
    public static void main(String[] args) {

        String str = "Hello World Java";
        // Input string

        String result = Arrays.stream(str.split(" "))
                // Split string into words → ["Hello", "World", "Java"]

                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            // Reverse the list of words
                            return list;
                        }
                ))

                .stream()
                // Convert list back to stream

                .collect(Collectors.joining(" "));
        // Join words back into a single string

        System.out.println(result);
        // Output → "Java World Hello"


        String resultString = "Hello World Java 123 982";;

// Step 1: Convert string to list of words
        List<String> words = Arrays.stream(resultString.split(" "))
                .collect(Collectors.toList())
                        .reversed();
// Split string and collect into a List

// Step 2: Reverse the list
//        Collections.reverse(words);
// Reverse word order

// Step 3: Join back into string
        resultString = String.join(" ", words);
// Convert list to stream and join with space

        System.out.println(resultString);


    }
}
