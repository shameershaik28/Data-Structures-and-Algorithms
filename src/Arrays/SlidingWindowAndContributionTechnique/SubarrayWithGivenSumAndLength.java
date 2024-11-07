package Arrays.SlidingWindowAndContributionTechnique;

import java.util.Scanner;

public class SubarrayWithGivenSumAndLength {
    public int solve(int[] A, int B, int C) {
        int N = A.length;
        int sum = 0;

        // Initial sum for the first window
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        // If the first window already has the desired sum, return 1
        if (sum == C) {
            return 1;
        }

        // Sliding window: adjust sum as we slide over the array
        int s = 0, e = B;  // start of window is 0, end is B
        while (e < N) {
            sum = sum - A[s] + A[e];  // Slide the window by removing the element at 's' and adding the element at 'e'
            s++;  // Move the start of the window to the right
            e++;  // Move the end of the window to the right

            // If the sum matches C at any point, return 1
            if (sum == C) {
                return 1;
            }
        }

        // If no such subarray is found, return 0
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Enter the length of the array");
        int B = scanner.nextInt();
        System.out.println("Enter the C sum");
        int C = scanner.nextInt();
        SubarrayWithGivenSumAndLength s = new SubarrayWithGivenSumAndLength();
        int ans = s.solve(A, B, C);
        System.out.println(ans);
    }

}
