package Arrays.PrefixSum;

import java.util.Scanner;

public class MaxSumContiguousSubarray {
    public int maxSubArray(final int[] A) {
        int N = A.length;
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < N; i++) {
            currSum += A[i];
            if(currSum > max) {
                max = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
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
