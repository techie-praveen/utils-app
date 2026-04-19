package org.core.stream.api.utils_string;


import java.util.*;
import java.util.stream.*;

public class GroupingWithEvenOdd {
        public static void main(String[] args) {

            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

            // Group numbers into even and odd
            Map<String, List<Integer>> grouped =
                    list.stream()

                            .collect(Collectors.groupingBy(
                                    n -> (n % 2 == 0) ? "Even" : "Odd"
                            ));

            System.out.println(grouped);
        }
    }
