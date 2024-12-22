package TwoPointers;

import java.util.Arrays;
import java.util.Scanner;

public class SubarrayWithGivenSum {
    public int[] solve(int[] A, int B) {
        int N = A.length;
        int i = 0, j = 0;
        int sum = 0;

        while (j < N) {
            // Add current element to sum
            sum += A[j];

            // If sum exceeds B, move the left pointer to reduce the window
            while (sum > B && i <= j) {
                sum -= A[i];
                i++;
            }

            // If sum matches B, return the subarray
            if (sum == B) {
                int[] ans = new int[j - i + 1];
                for (int k = 0; k < ans.length; k++) {
                    ans[k] = A[i + k];
                }
                return ans;
            }

            // Expand the window by moving the right pointer
            j++;
        }

        // No valid subarray found
        return new int[]{-1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int N = sc.nextInt();

        int[] A = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum:");
        int B = sc.nextInt();

        SubarrayWithGivenSum obj = new SubarrayWithGivenSum();
        int[] ans = obj.solve(A, B);
        System.out.println(Arrays.toString(ans));
    }
}
