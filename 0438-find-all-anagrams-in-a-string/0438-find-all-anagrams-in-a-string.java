import java.util.*;

public class Solution {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] window = new int[26];

        // Count characters in p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {
            // Add current character to window
            window[s.charAt(i) - 'a']++;

            // Remove left character if window size > k
            if (i >= k) {
                window[s.charAt(i - k) - 'a']--;
            }

            // Compare arrays
            if (Arrays.equals(pCount, window)) {
                result.add(i - k + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc")); // [0, 6]
        System.out.println(findAnagrams("abab", "ab"));        // [0, 1, 2]
    }
}