package org.core.stream.api.utils_string;
 import java.util.*;
        import java.util.stream.*;


public class CountCharacters {
    public static void main(String[] args) {

        String str = "programming";

        // Convert string to stream of characters
        Map<Character, Long> freqMap =
                str.chars() // IntStream of ASCII values
                        .mapToObj(c -> (char) c) // convert int → char

                        // groupingBy: group same characters
                        // counting(): count occurrences
                        .collect(Collectors.groupingBy(
                                c -> c,
                                Collectors.counting()
                        ));

        System.out.println(freqMap);
    }
}
