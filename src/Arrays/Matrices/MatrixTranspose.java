package Arrays.Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {
    public int[][] solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
         int[][] ans = new int[M][N];
        for(int j=0; j<M ;j++)
        {
            for(int i=0; i<N; i++)
            {
                ans[j][i]=A[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int M = sc.nextInt();

        int[][] A = new int[N][M];
        System.out.println("Enter the elements of 2D matrix : ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        MatrixTranspose mt = new MatrixTranspose();
        int[][] ans = mt.solve(A);
        System.out.println(Arrays.deepToString(ans));
    }
}
