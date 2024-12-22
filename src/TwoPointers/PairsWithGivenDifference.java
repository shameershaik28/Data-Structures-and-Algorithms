package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class PairsWithGivenDifference {
    public int solve(int[] A, int B) {
        // Sort the array to use the two-pointer technique
        Arrays.sort(A);

        int N = A.length;
        int left = 0;
        int right = 1;
        int count = 0;

        // Iterate using the two-pointer approach
        while (right < N && left < N) {
            int diff = Math.abs(A[right] - A[left]);

            // Skip duplicate pairs
            if (left > 0 && A[left] == A[left - 1] && A[right] == A[right - 1]) {
                left++;
                right++;
                continue;
            }

            // Handle the absolute difference logic
            if (diff == B) {
                count++;
                left++;
                right++;
            } else if (diff > B) {
                left++; // Reduce difference by moving left pointer
            } else {
                right++; // Increase difference by moving right pointer
            }

            // Ensure left pointer does not overtake right pointer
            if (left == right) {
                right++;
            }
        }

        return count; // Return the total count of distinct pairs
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input size of the array
        int N = in.nextInt();
        int[] A = new int[N];

        // Input elements of the array
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }

        // Input the target difference
        int B = in.nextInt();

        // Create an object and call the solve method
        PairsWithGivenDifference obj = new PairsWithGivenDifference();
        System.out.println(obj.solve(A, B));
    }
}
