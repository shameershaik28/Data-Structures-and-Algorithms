package Arrays.Matrices;

import java.util.Scanner;

public class Spiralmatrix {
    public void solve(int[][] A) {
        int N = A.length;
        int i = 0, j = 0;
        while (N > 1)
        {
            for (int l = 1; l < N; l++) {
                System.out.print(A[i][j] + " ");
                j++;
            }

            for (int l = 1; l < N; l++) {
                System.out.print(A[i][N - 1] + " ");
                i++;
            }

            for (int l = 1; l < N; l++) {
                System.out.print(A[N - 1][j] + " ");
                j--;
            }

            for (int l = 1; l < N; l++) {
                System.out.print(A[i][j] + " ");
                i--;
            }
            i++;
            j++;
            N = N - 2;

            if (N == 1) {
                System.out.print(A[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];
System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Spiralmatrix sp = new Spiralmatrix();
        sp.solve(matrix);
    }
}
