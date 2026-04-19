package org.core.stream.api.utils_string;

public class ReverseString {

    static void main(String[] args) {
        String reverse = reverse("praveen");
        System.out.println(reverse);
        reverseWithoutInbuilt(reverse);
        System.out.println(reverse);
        reverseWithoutInbuiltWithForLoop(reverse);
        System.out.println(reverse);
        reverseLoopWithCondition(reverse);
        System.out.println(reverse);

    }

    public static String reverse(String str) {
        System.out.println("### reverse ##");
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseWithoutInbuiltWithForLoop(String str) {
        System.out.println("### reverseWithoutInbuiltWithForLoop ##");
        char[] arr = str.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        return new String(arr);
    }

    public static String reverseLoopWithCondition(String str) {
        System.out.println("### reverseLoopWithCondition ##");
        char[] arr = str.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (i < n - 1 - i) {
                char temp = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = temp;
            }
        }

        return new String(arr);
    }

    public static String reverseWithoutInbuilt(String str) {
        System.out.println("### reverseWithoutInbuilt ##");
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}
