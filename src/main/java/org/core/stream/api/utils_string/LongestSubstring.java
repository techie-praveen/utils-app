package org.core.stream.api.utils_string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {

        String str = "abcdab";
        // Input string

        Set<Character> set = new HashSet<>();
        // Stores unique characters in current window

        int left = 0, maxLength = 0;
        // left → start of window
        // maxLength → stores result

        for (int right = 0; right < str.length(); right++) {
            // right → end of window

            while (set.contains(str.charAt(right))) {
                // If duplicate found, shrink window from left

                set.remove(str.charAt(left));
                // Remove leftmost character

                left++;
                // Move left pointer forward
            }

            set.add(str.charAt(right));
            // Add current character to set

            maxLength = Math.max(maxLength, right - left + 1);
            // Update maximum length
        }

        System.out.println("Longest length: " + maxLength);
        // Output result
    }
}
