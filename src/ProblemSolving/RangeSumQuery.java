package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class RangeSumQuery {
    public int[] solve(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;
        int[] ans = new int[m];

        // Edge Case: Empty array (if n == 0, we should return empty result array for queries)
        if (n == 0) {
            Arrays.fill(ans, 0);  // No elements to sum
            return ans;
        }

        // Step 1: Preprocess prefix sum array
        int[] prefix = new int[n];  // prefix[0] = A[0], and prefix[i] = sum from A[0] to A[i]
        prefix[0] = A[0];  // Set the first element

        // Build the prefix sum array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + A[i];
        }

        // Step 2: Answer each query in O(1) using the prefix sum array
        for (int i = 0; i < m; i++) {
            int left = B[i][0];
            int right = B[i][1];

            // Edge Case: Invalid range where left > right
            if (left > right || left < 0 || right >= n) {
                ans[i] = 0; // Return 0 for invalid queries
            } else {
                // Range sum using prefix sum array
                if (left == 0) {
                    ans[i] = prefix[right];  // Sum from 0 to right
                } else {
                    ans[i] = prefix[right] - prefix[left - 1];  // Sum from left to right
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = in.nextInt();
        System.out.println("Enter the number m : ");
        int m = in.nextInt();

        int[] A = new int[n];
        System.out.println("Enter the elements of 1D-array : ");
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        int[][] B = new int[m][2];
System.out.println("Enter the elements of 2D- array : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = in.nextInt();
            }
        }

        RangeSumQuery q = new RangeSumQuery();
        System.out.println(Arrays.toString(q.solve(A, B)));
    }
}
