package Arrays.Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class ColumnSum {
    public int[] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        int[] ans = new int[M];
        for(int c=0; c<M;c++)
        {
            int sum =0;
            for(int i=0; i<N;i++)
            {
               sum = sum + A[i][c];
            }
            ans[c] = sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int M = sc.nextInt();

        int[][] matrix = new int[N][M];

        System.out.println("Enter the elements in matrix:");
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        ColumnSum cs = new ColumnSum();
        int[] ans = cs.solve(matrix);
        System.out.println(Arrays.toString(ans));
    }
}
