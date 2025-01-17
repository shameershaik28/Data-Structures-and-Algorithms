package Arrays.Matrices.SubMatrices;

import java.util.Arrays;
import java.util.Scanner;

public class SubMatrixSumQueries {
        public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
            int N = A.length;  // Number of rows in matrix A
            int M = A[0].length;  // Number of columns in matrix A
            int MOD = 1000000007;  // Modulo value to prevent overflow

            // Step 1: Build the prefix sum matrix
            int[][] prefix = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    // Start with the current element
                    prefix[i][j] = A[i][j];

                    // Add the sum of the row above (if it exists)
                    if (i > 0) {
                        prefix[i][j] = (prefix[i][j] + prefix[i - 1][j]) % MOD;
                    }

                    // Add the sum of the column to the left (if it exists)
                    if (j > 0) {
                        prefix[i][j] = (prefix[i][j] + prefix[i][j - 1]) % MOD;
                    }

                    // Subtract the overlap (top-left diagonal element) if it exists
                    if (i > 0 && j > 0) {
                        prefix[i][j] = (prefix[i][j] - prefix[i - 1][j - 1] + MOD) % MOD;
                    }
                }
            }

            // Step 2: Process each query
            int sum = 0;
            int[] res = new int[B.length];
            for (int i = 0; i < B.length; i++) {
                int r1 = B[i] - 1;
                int r2 = D[i] - 1;
                int c1 = C[i] - 1;
                int c2 = E[i] - 1;
                sum = prefix[r2][c2];
                if (r1 > 0 && c1 > 0) {
                    sum = (sum + prefix[r1 - 1][c1 - 1]) % MOD;
                }
                if (r1 > 0) {
                    sum = (sum - prefix[r1 - 1][c2]) % MOD;
                }
                if (c1 > 0) {
                    sum = (sum - prefix[r2][c1 - 1]) % MOD;
                }
                if (sum < 0) {
                    sum = (sum + MOD) % MOD;
                }
                res[i] = sum;
            }
            return res;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.println("Enter number of rows and columns of array: ");
        int N = sc.nextInt();  // Number of rows
        int M = sc.nextInt();  // Number of columns
        int[][] A = new int[N][M];

        // Input matrix values
        System.out.println("Enter array: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input number of queries
        System.out.println("Enter number of queries: ");
        int Q = sc.nextInt();

        // Input query parameters
        int[] B = new int[Q];
        int[] C = new int[Q];
        int[] D = new int[Q];
        int[] E = new int[Q];
        System.out.println("Enter queries: ");
        for (int i = 0; i < Q; i++) {
            B[i] = sc.nextInt();  // Top-left row
            C[i] = sc.nextInt();  // Top-left column
            D[i] = sc.nextInt();  // Bottom-right row
            E[i] = sc.nextInt();  // Bottom-right column
        }

        // Solve the submatrix sum queries
        SubMatrixSumQueries obj = new SubMatrixSumQueries();
        int[] result = obj.solve(A, B, C, D, E);

        // Output the results
        System.out.println(Arrays.toString(result));
    }
}
