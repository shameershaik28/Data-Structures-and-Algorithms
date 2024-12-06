package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsK {
    public int solve(int[] A, int B) {
        int N = A.length;
        int count = 0;
        int prefixSum = 0;  // Running prefix sum
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // We add 0 to the map with count 1 to handle subarrays that directly sum to B

        // Traverse the array
        for (int i = 0; i < N; i++) {
            prefixSum += A[i];  // Update the running prefix sum

            // Check if there is a subarray that sums to B
            if (map.containsKey(prefixSum - B)) {
                count += map.get(prefixSum - B);  // Add the frequency of the (prefixSum - B) to count
            }

            // Add the current prefix sum to the map with its frequency
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;  // Return the total count of subarrays with sum equal to B
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // Input the size of the array
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();  // Input array elements
        }
        int B = sc.nextInt();  // Input the target sum

        SubarraySumEqualsK sol = new SubarraySumEqualsK();
        System.out.println(sol.solve(A, B));  // Output the result
    }
}
