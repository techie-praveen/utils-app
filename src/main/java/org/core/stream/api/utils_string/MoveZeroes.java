package org.core.stream.api.utils_string;
//Java Program to move all zeroes to end of array |
import java.util.Arrays;
import java.util.stream.IntStream;

public class MoveZeroes {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};
        // Input array

        int[] result = IntStream.concat(
                Arrays.stream(arr).filter(n -> n != 0), // keep non-zero elements
                Arrays.stream(arr).filter(n -> n == 0)  // collect zero elements
        ).toArray(); // merge streams and convert to array

        System.out.println(Arrays.toString(result));
        // prints: [1, 3, 12, 0, 0]
    }
}