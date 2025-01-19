package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubarrayZeroSum {
    public int solve(int[] A) {
        // HashMap to store the frequency of each prefix sum
        HashMap<Long, Integer> map = new HashMap<>();
        long prefixSum = 0;
        int count = 0;

        // Initialize the map to count subarrays starting from the first element
        map.put(0L, 1);  // This is to handle the case when the subarray itself starts from index 0 and has sum zero

        // Traverse through the input array using a traditional for loop
        for (int i = 0; i < A.length; i++) {
            prefixSum += A[i];  // Calculate the running prefix sum

            // If the current prefix sum has been encountered before
            if (map.containsKey(prefixSum)) {
                // Add the number of times this prefix sum has occurred to count
                count += map.get(prefixSum);
                // Update the frequency of this prefix sum
                map.put(prefixSum, map.get(prefixSum) + 1);
            } else {
                // If the prefix sum is encountered for the first time, initialize its frequency to 1
                map.put(prefixSum, 1);
            }
        }

        // Return the final count of subarrays with sum zero
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        CountSubarrayZeroSum c = new CountSubarrayZeroSum();
        System.out.println(c.solve(A));
    }
}
