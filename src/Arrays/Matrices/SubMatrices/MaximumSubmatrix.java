package Arrays.Matrices.SubMatrices;

import java.util.Scanner;

public class MaximumSubmatrix {
    public long solve(int[][] A) {

        int n = A.length;
        int m = A[0].length;
        long[][] pre = new long[n][m];

        long ans = A[n - 1][m - 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (i == n - 1 && j == m - 1)
                {
                    pre[i][j] = A[i][j];
                }
                else if (i == n - 1)
                {
                    pre[i][j] = pre[i][j + 1] + A[i][j];
                }
                else if (j == m - 1)
                {
                    pre[i][j] = pre[i + 1][j] + A[i][j];
                }
                else
                {
                    pre[i][j] = pre[i][j + 1] + pre[i + 1][j] - pre[i + 1][j + 1] + A[i][j];
                }

                ans = Math.max(ans, pre[i][j]);

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns");
        int M = sc.nextInt();
        System.out.println("Enter the matrix A");
        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        MaximumSubmatrix ms = new MaximumSubmatrix();
        System.out.println(ms.solve(A));
    }
}
