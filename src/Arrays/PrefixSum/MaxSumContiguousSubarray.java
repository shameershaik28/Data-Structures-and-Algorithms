package Arrays.PrefixSum;

import java.util.Scanner;

public class MaxSumContiguousSubarray {
    public int maxSubArray(final int[] A) {
        int N = A.length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++) {
            int sum = 0;
            for(int j = i; j < N; j++) {
                sum += A[j];
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MaxSumContiguousSubarray obj = new MaxSumContiguousSubarray();
        int ans = obj.maxSubArray(arr);
        System.out.println(ans);
    }
}
