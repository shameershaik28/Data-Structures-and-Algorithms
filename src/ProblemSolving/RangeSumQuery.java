package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class RangeSumQuery {
    public int[] solve(int[] A, int[][] B) {
        int m = B.length;

        int[] ans = new int[m];
        for(int i=0; i<m; i++) {
            int sum = 0;
            for(int j=B[i][0]; j<=B[i][1]; j++) {
             sum =sum +A[j];
            }
            ans[i] = sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n = in.nextInt();
        System.out.println("Enter the number m : ");
        int m = in.nextInt();

        int[] A = new int[n];
        System.out.println("Enter the elements of 1D-array : ");
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        int[][] B = new int[m][2];
System.out.println("Enter the elements of 2D- array : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = in.nextInt();
            }
        }

        RangeSumQuery q = new RangeSumQuery();
        System.out.println(Arrays.toString(q.solve(A, B)));
    }
}
