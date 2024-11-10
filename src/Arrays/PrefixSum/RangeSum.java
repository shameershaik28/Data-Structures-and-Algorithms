package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class RangeSum {
    public int[] solve(int[] A, int[][] B) {
        int N = A.length;
        int Q = B.length;
        int[] arr = new int[N];

        // Apply the difference array approach for each query
        for (int i = 0; i < Q; i++) {
            int start = B[i][0] - 1; // 1-based to 0-based index
            int end = B[i][1] - 1;   // 1-based to 0-based index
            int val = B[i][2];

            // Add value at the start index
            arr[start] += val;

            // Subtract value after the end index if within bounds
            if (end + 1 < N) {
                arr[end + 1] -= val;
            }
        }

        // Perform prefix sum on arr to accumulate the changes
        for (int i = 1; i < N; i++) {
            arr[i] += arr[i - 1];
        }

        // Add the accumulated values from arr to A
        for (int i = 0; i < N; i++) {
            A[i] += arr[i]; // Update A with the accumulated changes
        }

        return A;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = in.nextInt();
        System.out.println("Enter the row size of the 2D array");
        int M = in.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array A ");
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }

        int[][] B = new int[M][3];
        System.out.println("Enter the queries of B ");
        for (int i = 0; i < M; i++) {
            B[i][0] = in.nextInt();
            B[i][1] = in.nextInt();
            B[i][2] = in.nextInt();
        }

        RangeSum rs = new RangeSum();
        int[] ans = rs.solve(A,B);
        System.out.println(Arrays.toString(ans));
    }
}
