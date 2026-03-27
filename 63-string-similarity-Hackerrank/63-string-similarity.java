import java.util.*;

public class Solution {

    public static long stringSimilarity(String s) {
        int n = s.length();
        int[] Z = new int[n];

        int left = 0, right = 0;

        for (int i = 1; i < n; i++) {

            if (i <= right) {
                Z[i] = Math.min(right - i + 1, Z[i - left]);
            }

            while (i + Z[i] < n && s.charAt(Z[i]) == s.charAt(i + Z[i])) {
                Z[i]++;
            }

            if (i + Z[i] - 1 > right) {
                left = i;
                right = i + Z[i] - 1;
            }
        }

        long sum = n; // IMPORTANT: long

        for (int val : Z) {
            sum += val;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(stringSimilarity(s));
        }

        sc.close();
    }
}
