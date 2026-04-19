package org.core.stream.api.utils_string;

public class MergeSortedArrays {
        public static void main(String[] args) {

            // Input sorted arrays
            int[] a = {1,3,5}, b = {2,4,6},

                    // Result array of size sum of both arrays
                    r = new int[a.length + b.length];

            // i -> index for a, j -> index for b, k -> index for result
            int i = 0, j = 0, k = 0;

            // Compare elements from both arrays until one ends
            while (i < a.length && j < b.length)
                // Add smaller element to result and move pointer
                r[k++] = a[i] < b[j] ? a[i++] : b[j++];

            // Copy remaining elements of array a (if any)
            while (i < a.length) r[k++] = a[i++];

            // Copy remaining elements of array b (if any)
            while (j < b.length) r[k++] = b[j++];

            // Print merged sorted array
            for (int x : r) System.out.print(x + " ");
        }
    }