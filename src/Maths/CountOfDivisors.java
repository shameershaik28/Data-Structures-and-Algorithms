package Maths;

import java.util.Arrays;
import java.util.Scanner;

public class CountOfDivisors {
    public int[] solve(int[] A) {
        int max = 0;

        // Find the maximum value in the array
        for (int i = 0; i < A.length; i++) {
            max = Math.max(max, A[i]);
        }

        // Create an array to store divisor counts for all numbers up to 'max'
        int[] cf = new int[max + 1];

        // Precompute divisor counts using a modified sieve approach
        for (int i = 1; i <= max; i++) {
            for (int j = i; j <= max; j += i) {
                cf[j] += 1;
            }
        }

        // Create the result array and fill it with the divisor counts
        int[] ans = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            ans[i] = cf[A[i]];
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        CountOfDivisors obj = new CountOfDivisors();
        System.out.println(Arrays.toString(obj.solve(A)));
    }
}
