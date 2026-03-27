import java.util.*;

public class Solution {

    public static void maxSubarray(int[] arr) {
        int currentSum = arr[0];
        int maxSubarraySum = arr[0];

        int maxSubsequenceSum = 0;
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (i > 0) {
                currentSum = Math.max(arr[i], currentSum + arr[i]);
                maxSubarraySum = Math.max(maxSubarraySum, currentSum);
            }

            if (arr[i] > 0) {
                maxSubsequenceSum += arr[i];
            }

            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        if (maxSubsequenceSum == 0) {
            maxSubsequenceSum = maxElement;
        }

        System.out.println(maxSubarraySum + " " + maxSubsequenceSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            maxSubarray(arr);
        }

        sc.close();
    }
}
