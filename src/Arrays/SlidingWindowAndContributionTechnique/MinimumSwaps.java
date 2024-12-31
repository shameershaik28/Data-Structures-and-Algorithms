package Arrays.SlidingWindowAndContributionTechnique;

import java.util.Scanner;

public class MinimumSwaps {
    public int solve(int[] A, int B) {
        int n = A.length;
        int count = 0; // Count of elements <= B
        int bad = 0;   // Count of elements > B in the first window
        int minSwaps;  // Minimum swaps required

        // Step 1: Count the number of elements <= B
        for (int num : A) {
            if (num <= B) {
                count++;
            }
        }

        // Step 2: Count "bad" elements in the first window of size `count`
        for (int i = 0; i < count; i++) {
            if (A[i] > B) {
                bad++;
            }
        }

        // Initialize `minSwaps` to the count of bad elements in the first window
        minSwaps = bad;

        // Step 3: Sliding window logic
        int windowStart = 0; // Start of the window
        for (int windowEnd = count; windowEnd < n; windowEnd++) {
            // Check if the element leaving the window is "bad"
            if (A[windowStart] > B) {
                bad--; // Reduce bad count if the outgoing element is bad
            }

            // Check if the element entering the window is "bad"
            if (A[windowEnd] > B) {
                bad++; // Increase bad count if the incoming element is bad
            }

            // Move the start of the window forward
            windowStart++;

            // Update `minSwaps` to the smallest `bad` count seen so far
            minSwaps = Math.min(minSwaps, bad);
        }

        // Step 4: Return the minimum swaps required
        return minSwaps;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int B = sc.nextInt();

        MinimumSwaps solution = new MinimumSwaps();
        int ans = solution.solve(A, B);
        System.out.println(ans);
    }
}
