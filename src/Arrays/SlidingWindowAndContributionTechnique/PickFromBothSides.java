package Arrays.SlidingWindowAndContributionTechnique;

import java.util.Scanner;

//Most Optimal Approach TC: 0(N) and SC: O(1)
//Sliding Window Technique
public class PickFromBothSides {
    public int solve(int[] A, int B) {
        int N = A.length;

        // Calculate the sum of the first B elements (initial left side)
        int currentSum = 0;
        for (int i = 0; i < B; i++) {
            currentSum += A[i];
        }

        // Initialize the maximum sum as the current sum
        int maxSum = currentSum;

        // Now slide the window from left to right, considering elements from the right side
        for (int i = 0; i < B; i++) {
            // Remove one element from the left (currentSum - A[B - 1 - i])
            // and add one element from the right (currentSum + A[N - 1 - i])
            currentSum -= A[B - 1 - i];
            currentSum += A[N - 1 - i];

            // Update the maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
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

        System.out.println("Enter the B element");
        int B = sc.nextInt();

        PickFromBothSides p = new PickFromBothSides();
        int ans = p.solve(A, B);
        System.out.println("The maximum possible sum: " + ans);
    }
}

