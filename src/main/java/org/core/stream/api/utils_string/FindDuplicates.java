package org.core.stream.api.utils_string;

import java.util.HashSet;
import java.util.Set;

import static org.core.stream.api.LoggerUtil.getMethodName;

public class FindDuplicates {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7};
        findDuplicates(arr);

    }

    public static void findDuplicates(int[] arr) {
        IO.println(getMethodName());
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println(num);
            }
        }
    }
}
