package org.core.stream.api.core.codebase;

import java.util.*;

public class TwoSumArrayData {

    public static int[] twoSum(int[] nums, int target) {
        System.out.println("Starting twoSum with target: " + target);

        // HashMap to store number and its index
        // Key = number, Value = index
        Map<Integer, Integer> map = new HashMap<>();

        // Loop through array
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Iteration " + i + ": num = " + nums[i]);

            // Find complement (the number needed to reach target)
            int complement = target - nums[i];
            System.out.println("Complement calculated: " + complement);

            // Check if complement already exists in map
            if (map.containsKey(complement)) {
                System.out.println("Complement found in map at index: " + map.get(complement));

                // If yes → we found the pair
                // Return index of complement + current index
                System.out.println("Found pair at indices: " + map.get(complement) + " and " + i);
                System.out.println("Repeat Output"+ Arrays.toString(new int[]{map.get(complement), i}));
                return new int[] { map.get(complement), i };
            }

            // If not found → store current number with its index
            System.out.println("Complement not found, storing " + nums[i] + " at index " + i);
            map.put(nums[i], i);
        }

        // If no pair found (edge case)
        System.out.println("No pair found");
        return new int[] {};
    }

     void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        // Print result indices
        System.out.println("Result "+result[0] + ", " + result[1]);
    }
}
