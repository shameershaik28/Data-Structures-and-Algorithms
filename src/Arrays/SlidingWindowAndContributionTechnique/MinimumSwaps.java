package Arrays.SlidingWindowAndContributionTechnique;

import java.util.Scanner;

public class MinimumSwaps {
    public int solve(int[] A, int B) {
        // Initialize variables
        int min_swaps = Integer.MAX_VALUE; // Initialize min_swaps to maximum possible integer value
        int n = A.length; // Length of array A
        int numLessThanB = 0; // Count of elements less than or equal to B in A

        // Count the number of elements in A that are less than or equal to B
        for(int i = 0; i < n; i++) {
            if(A[i] <= B) {
                numLessThanB++;
            }
        }
        int k = numLessThanB; // Store the count of elements less than or equal to B
        int temp = 0;

        // Count the number of elements greater than B in the first k elements of A
        for(int i = 0; i < k; i++) {
            if(A[i] > B) {
                temp++;
            }
        }

        min_swaps = temp; // Initialize min_swaps with the count of elements greater than B in the first k elements
        int swaps = min_swaps; // Initialize swaps with min_swaps

        int s = 1;
        int e = k;

        // Sliding window approach
        while(e < n) {
            // Decrement swaps if the element going out of the window is greater than B
            if(A[s - 1] > B) {
                swaps--;
            }
            // Increment swaps if the element coming into the window is greater than B
            if(A[e] > B) {
                swaps++;
            }
            // Update min_swaps if swaps is less than min_swaps
            if(swaps < min_swaps) {
                min_swaps = swaps;
            }
            s++;
            e++;
        }
        // Return the minimum number of swaps required
        return min_swaps;
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
