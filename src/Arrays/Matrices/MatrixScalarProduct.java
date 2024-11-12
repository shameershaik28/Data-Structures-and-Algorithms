package Arrays.Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixScalarProduct {
    public int[][] solve(int[][] A, int B) {
        int N = A.length;
        int M = A[0].length;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                A[i][j] = A[i][j]*B;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int M = sc.nextInt();

        int[][] A = new int[N][M];
        System.out.println("Enter the elements in the 2D Array: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int B = sc.nextInt();

        MatrixScalarProduct m = new MatrixScalarProduct();
        int[][] ans = m.solve(A, B);
        System.out.println(Arrays.deepToString(ans));
    }
}
