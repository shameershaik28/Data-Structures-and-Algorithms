package Arrays.Subarrays;

import java.util.Scanner;

// Used Prefix Sum approach
public class MaximumSubarraySum {
    public long solve(int[] A) {
        int N = A.length;

        long max = Integer.MIN_VALUE;
        long curSum = 0;
        for (int i = 0; i < N; i++) {
            curSum = Math.max(A[i], curSum + A[i]);
            max = Math.max(max, curSum);
        }
        return max;
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

        MaximumSubarraySum obj = new MaximumSubarraySum();
        long ans = obj.solve(A);
        System.out.println(ans);
    }
}
