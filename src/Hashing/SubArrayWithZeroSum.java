package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SubArrayWithZeroSum {
        // Method to solve the problem
        public int solve(int[] A) {
            int n = A.length;  // Length of the array A
            long pf[] = new long[n];  // Array to store prefix sums
            HashMap<Long, Integer> hm = new HashMap<>();  // HashMap to store prefix sum and their indices

            // Initialize the prefix sum array
            pf[0] = A[0];  // The first element is the same as the first prefix sum
            for (int i = 1; i < n; i++) {
                pf[i] = pf[i - 1] + A[i];  // Compute prefix sum for each index
            }

            // Check the first condition: If any prefix sum is zero, return 1
            for (int i = 0; i < n; i++) {
                if (pf[i] == 0) {  // If the current prefix sum is zero
                    return 1;  // Return 1 as the solution
                }
            }

            // Check the second condition: If a prefix sum repeats, return 1
            for (int i = 0; i < n; i++) {
                if (hm.containsKey(pf[i])) {  // If the current prefix sum has already been seen
                    return 1;  // Return 1 as the solution
                } else {
                    hm.put(pf[i], i);  // Store the current prefix sum and its index
                }
            }

            // If no condition is met, return 0
            return 0;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        SubArrayWithZeroSum s = new SubArrayWithZeroSum();
        System.out.println(s.solve(A));
    }
}
