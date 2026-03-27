import java.util.*;

public class Solution {

    // Helper function to check palindrome
    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int palindromeIndex(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {

                // Try removing left character
                if (isPalindrome(s, left + 1, right)) {
                    return left;
                }

                // Try removing right character
                if (isPalindrome(s, left, right - 1)) {
                    return right;
                }

                return -1;
            }
            left++;
            right--;
        }

        return -1; // already palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        sc.nextLine();

        while (q-- > 0) {
            String s = sc.nextLine();
            System.out.println(palindromeIndex(s));
        }

        sc.close();
    }
}
