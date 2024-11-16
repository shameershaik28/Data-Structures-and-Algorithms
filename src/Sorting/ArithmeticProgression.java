package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticProgression {
    public int solve(int[] A) {
                // Step 1: Sort the array
                   Arrays.sort(A);

                // Step 2: Calculate the common difference
                int diff = A[1] - A[0];

                // Step 3: Check differences between consecutive elements
                for (int i = 2; i < A.length; i++) {
                    if (A[i] - A[i - 1] != diff) {
                        return 0; // Not an arithmetic progression
                    }
                }

                return 1; // Can form an arithmetic progression
            }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        ArithmeticProgression obj = new ArithmeticProgression();
        int ans = obj.solve(A);
        System.out.println(ans);
    }
}
