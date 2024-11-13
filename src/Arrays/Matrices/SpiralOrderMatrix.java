package Arrays.Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralOrderMatrix {
    public int[][] generateMatrix(int A) {
        int[][] matrix = new int[A][A];
        int N = A;
        int i = 0, j = 0;
        int p = 1;

        while (N > 0) {
            if (N == 1) { // Special case for the very center of an odd-dimensioned matrix
                matrix[i][j] = p++;
                break;
            }

            // Traverse from left to right
            for (int l = 1; l < N; l++) {
                matrix[i][j] = p++;
                j++;
            }

            // Traverse from top to bottom
            for (int l = 1; l < N; l++) {
                matrix[i][j] = p++;
                i++;
            }

            // Traverse from right to left
            for (int l = 1; l < N; l++) {
                matrix[i][j] = p++;
                j--;
            }

            // Traverse from bottom to top
            for (int l = 1; l < N; l++) {
                matrix[i][j] = p++;
                i--;
            }

            // Move to the inner layer
            i++;
            j++;
            N -= 2;
        }

        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int A = sc.nextInt();
        SpiralOrderMatrix m = new SpiralOrderMatrix();
        int[][] ans = m.generateMatrix(A);

        // Print the matrix in a readable format
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}
