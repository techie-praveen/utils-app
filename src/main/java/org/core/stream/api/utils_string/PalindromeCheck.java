package org.core.stream.api.utils_string;

public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

//https://chatgpt.com/gg/69d48531c46c81a08a4ce20cf9253c8d//