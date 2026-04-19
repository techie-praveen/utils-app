package org.core.stream.api.utils_string;

import java.util.Map;
import java.util.stream.Collectors;

import static org.core.stream.api.LoggerUtil.getMethodName;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        findDuplicateCharacters(str);
    }

    public static void findDuplicateCharacters(String str) {
        IO.println(getMethodName()); // Print the method name for logging
        // Convert the string to a stream of characters, group by character, and count occurrences
        Map<Character, Long> charCount = str.chars() // Get IntStream of Unicode code points
                .mapToObj(c -> (char) c) // Convert to Stream<Character>
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())); // Group by character and count
        System.out.println("Duplicate characters:"+charCount); // Print header for output
        // Stream the map entries, filter for duplicates, and print each
        charCount.entrySet().stream() // Stream the map entries
                .filter(entry -> entry.getValue() > 1) // Filter entries where count > 1 (duplicates)
                .forEach(entry -> System.out.println(entry.getKey() + " appears " + entry.getValue() + " times")); // Print each duplicate character with its count
    }
}
