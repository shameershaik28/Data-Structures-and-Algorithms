package Arrays.Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class RowSum {
    public int[] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
       int[] ans = new int[N];
        for(int i = 0; i < N; i++) {
            int sum =0;
            for(int j = 0; j < M; j++) {
                sum+=A[i][j];
            }
            ans[i]= sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size of the matrix");
        int N = sc.nextInt();
        System.out.println("Enter the column size the matrix");
        int M = sc.nextInt();
        int[][] A = new int[N][M];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        RowSum rs = new RowSum();
        int[] ans = rs.solve(A);
        System.out.println(Arrays.toString(ans));
    }

}
