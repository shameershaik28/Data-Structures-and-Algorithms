package PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class RangeSumQuery {
    public long[] rangeSum(int[] A, int[][] B) {
        int N = A.length;
        int Q = B.length;

        long[] ans = new long[Q];

        int[] prefixSum = new int[N];
        prefixSum[0] = A[0];

        for(int i =1; i<N ; i++)
        {
            prefixSum[i] = prefixSum[i-1] + A[i];
        }

        for(int i =0; i<Q; i++)
        {
            int s= B[i][0];
            int e= B[i][1];
            if(s==0)
            {
                ans[i]= prefixSum[e];
            }
            else {
                ans[i]= prefixSum[e] - prefixSum[s-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the range N: ");
        int N = sc.nextInt();
        System.out.println("Enter the range M: ");
        int M = sc.nextInt();

        int[] A = new int[N];
        System.out.println("Enter the elements of A: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[][] B = new int[M][2];
System.out.println("Enter the elements of B: ");
        for(int i = 0; i < M; i++){
            B[i][0]= sc.nextInt();
            B[i][1] = sc.nextInt();
        }

        RangeSumQuery r = new RangeSumQuery();
        System.out.println(Arrays.toString(r.rangeSum(A, B)));
    }
}
