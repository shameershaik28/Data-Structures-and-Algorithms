package InterviewQuestions;

public class DecreasingDishes {
    public int solve(int[] A) {
        int N = A.length;
        int maxSum = 0;  // Stores the maximum sum of a decreasing subarray
        int currentSum = 0;  // Tracks the sum of the current decreasing subarray

        for (int i = 0; i < N; i++) {
            if (i == 0 || A[i] < A[i - 1]) {
                // If it's the first element or part of a decreasing sequence
                currentSum += A[i];
            } else {
                // End of the current decreasing sequence
                maxSum = Math.max(maxSum, currentSum);
                currentSum = A[i]; // Start a new decreasing subarray
            }
        }

        // Check the last sequence after the loop ends
        maxSum = Math.max(maxSum, currentSum);

        return maxSum;
    }
}
