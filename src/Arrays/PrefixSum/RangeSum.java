package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class RangeSum {
    public int[] solve(int[] A, int[][] B) {
        int Q = B.length;

        for(int i = 0; i < Q; i++) {
            int start = B[i][0]-1;
            int end = B[i][1]-1;
            int val = B[i][2];

            for(int j = start; j <=end; j++) {
                A[j]+=val;
            }

        }
        return A;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = in.nextInt();
        System.out.println("Enter the row size of the 2D array");
        int M = in.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array A ");
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }

        int[][] B = new int[M][3];
        System.out.println("Enter the queries of B ");
        for (int i = 0; i < M; i++) {
            B[i][0] = in.nextInt();
            B[i][1] = in.nextInt();
            B[i][2] = in.nextInt();
        }

        RangeSum rs = new RangeSum();
        int[] ans = rs.solve(A,B);
        System.out.println(Arrays.toString(ans));
    }
}
