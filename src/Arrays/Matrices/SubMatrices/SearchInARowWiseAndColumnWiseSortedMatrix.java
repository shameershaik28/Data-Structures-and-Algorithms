package Arrays.Matrices.SubMatrices;

import java.util.Scanner;

public class SearchInARowWiseAndColumnWiseSortedMatrix {
    public int solve(int[][] A, int B) {
        int N = A.length;
        if (N == 0) return -1; // Edge case: empty matrix

        int M = A[0].length;
        int i = 0, j = M - 1; // Start from top-right corner
        int ans = Integer.MAX_VALUE;

        while (i < N && j >= 0) {
            if (A[i][j] == B) {
                // Update answer using 1-based indexing
                ans = Math.min(ans, (i + 1) * 1009 + (j + 1));
                j--; // Move down to check for smaller i
            } else if (A[i][j] < B) {
                i++; // Move down
            } else {
                j--; // Move left
            }
        }

        // If no answer was found, return -1
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] A = new int[N][M];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        int B = scanner.nextInt();

        SearchInARowWiseAndColumnWiseSortedMatrix s = new SearchInARowWiseAndColumnWiseSortedMatrix();
        System.out.println(s.solve(A, B));
    }
}
