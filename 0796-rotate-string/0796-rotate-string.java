class Solution {
    public boolean rotateString(String s, String goal) {
        // Length must be same
        if (s.length() != goal.length()) {
            return false;
        }

        // Check if goal is substring of s + s
        String doubled = s + s;

        return doubled.contains(goal);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        System.out.println(obj.rotateString("abcde", "cdeab")); // true
        System.out.println(obj.rotateString("abcde", "abced")); // false
    }
}