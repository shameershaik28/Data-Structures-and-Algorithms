package Arrays.OneDimensional;

import java.util.Scanner;

//Kadane’s Algorithm (O(N)):
//Find the maximum subarray sum.
public class MaxSumContiguousSubarray {
    public int maxSubArray(final int[] A) {
        int N = A.length;
        int max = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i = 0; i < N; i++) {
            curSum += A[i];
            if(curSum > max) {
                max = curSum;
            }
            //reset current sum to zero whenever it becomes less than zero
            if(curSum < 0) {
                curSum = 0;
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

        MaxSumContiguousSubarray m = new MaxSumContiguousSubarray();
        int ans = m.maxSubArray(arr);
        System.out.println(ans);
    }
}
