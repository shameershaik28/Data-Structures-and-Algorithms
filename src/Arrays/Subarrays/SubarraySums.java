package Arrays.Subarrays;

import java.util.Scanner;

//Brute-Force Approach used here
public class SubarraySums {
    public void subarraySum(int[] A) {
        int N = A.length;
        if (A.length == 0) {
            return;
        }
        int[] prefixSum = new int[N];
        prefixSum[0] = A[0];
        for (int i = 1; i < N; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }

        for(int i =0; i < N; i++) {
            for(int j = i; j < N; j++) {
                int sum;
                if (i == 0) {
                    sum = prefixSum[j];
                } else {
                    sum = prefixSum[j] - prefixSum[i - 1];
                }
                System.out.print(sum+" ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        SubarraySums s = new SubarraySums();
        s.subarraySum(arr);
    }
}
