package TwoPointers;

import java.util.Scanner;
import java.util.Arrays;

public class PairSumExist {
    public boolean solve(int[] A, int B) {
        // Ensure the array is sorted for the two-pointer approach
        Arrays.sort(A);

        int l = 0;
        int r = A.length - 1;

        while (l < r) {
            int sum = A[l] + A[r];

            if (sum == B) {
                return true;
            } else if (sum > B) {
                r--;
            } else {
                l++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for array size
        System.out.println("Enter the size of the array:");
        int N = sc.nextInt();

        if (N < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Initialize and populate the array
        int[] A = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Prompt for the target sum
        System.out.println("Enter the target sum:");
        int B = sc.nextInt();

        // Call solve method
        PairSumExist ps = new PairSumExist();
        boolean result = ps.solve(A, B);

        // Output result
        System.out.println("Does a pair with the given sum exist? " + result);
    }
}
