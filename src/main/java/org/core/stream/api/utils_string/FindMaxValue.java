package org.core.stream.api.utils_string;


import java.util.*;

public class FindMaxValue {
        public static void main(String[] args) {

            List<Integer> list = Arrays.asList(10, 20, 5, 40);

            // max(): finds maximum element
            Optional<Integer> max =
                    list.stream()
                            .max(Integer::compare);

            // Optional is used because result may be empty
            max.ifPresent(System.out::println); // 40
        }
    }
