package Arrays.Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSubtraction {
    public int[][] solve(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;

        for(int i =0; i<n;i++)
        {
            for(int j =0; j<m;j++)
            {
                A[i][j]=A[i][j]-B[i][j];
            }
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns ");
        int M = sc.nextInt();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        System.out.println("Enter the elements of A");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of B");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        MatrixSubtraction obj = new MatrixSubtraction();
        int[][] result = obj.solve(A, B);
        for (int i = 0; i < N; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
