package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class PairsWithGivenSumDuplicates {
    public int solve(int[] A, int B) {
        Arrays.sort(A); // Ensure the array is sorted
        int N = A.length;
        int left = 0;
        int right = N - 1;
        int count = 0;

        while (left < right) {
            int sum = A[left] + A[right];
            if (sum == B) {
                int c1 = 1, c2 = 1;
                    // Count duplicates on the left
                    while (left < right && A[left] == A[left + 1]) {
                        c1++;
                        left++;
                    }

                    // Count duplicates on the right
                    while (left< right && A[right] == A[right - 1]) {
                        c2++;
                        right--;
                    }

                    count += c1 * c2;
                    left++;
                    right--;
            } else if (sum > B) {
                right--;
            } else {
                left++;
            }
        }
        return count;
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
        PairsWithGivenSumDuplicates ps = new PairsWithGivenSumDuplicates();
        int result = ps.solve(A, B);

        // Output result
        System.out.println("Number of pairs " + result);;
    }
}
