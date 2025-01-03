package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SubArrayWithZeroSum {
    public int solve(int[] A) {
        int n = A.length;  // Length of the array A
        long pf = 0;  // Variable to store the current prefix sum
        HashSet<Long> set = new HashSet<>();  // HashSet to store the prefix sums

        // Traverse the array
        for (int i = 0; i < n; i++) {
            pf += A[i];  // Update the prefix sum

            // Check the first condition: If the current prefix sum is zero
            if (pf == 0) {
                return 1;  // Return 1 as the solution
            }

            // Check the second condition: If the prefix sum repeats
            if (set.contains(pf)) {
                return 1;  // Return 1 as the solution
            } else {
                set.add(pf);  // Add the current prefix sum to the set
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
