import java.util.*;

public class Solution {

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int sum = 0;

        // Step 1: First window
        for (int i = 0; i < m && i < s.size(); i++) {
            sum += s.get(i);
        }

        if (sum == d) count++;

        // Step 2: Sliding window
        for (int i = m; i < s.size(); i++) {
            sum += s.get(i);        // add next
            sum -= s.get(i - m);    // remove previous

            if (sum == d) count++;
        }

        return count;
    }

    // Main method for input/output
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> s = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }

        int d = sc.nextInt();
        int m = sc.nextInt();

        int result = birthday(s, d, m);
        System.out.println(result);

        sc.close();
    }
}
