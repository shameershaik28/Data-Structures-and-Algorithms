package Arrays.Matrices.SubMatrices;

import java.util.Scanner;

public class RowWithMaximumNumberOfOnes {
    public int solve(int[][] A) {
        int N = A.length;
        int maxIndex = -1;
        int maxOnes = 0;

        for (int i = 0; i < N; i++) {
            int firstOneIndex = findFirstOne(A[i], 0, N - 1);
            int countOnes = firstOneIndex == -1 ? 0 : (N - firstOneIndex);

            if (countOnes > maxOnes) {
                maxOnes = countOnes;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private int findFirstOne(int[] row, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row[mid] == 1 && (mid == 0 || row[mid - 1] == 0)) {
                return mid; // Found the first 1
            } else if (row[mid] == 0) {
                low = mid + 1; // Move right
            } else {
                high = mid - 1; // Move left
            }
        }
        return -1; // No 1s found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int N = sc.nextInt();

        int[][] A = new int[N][N];
        System.out.println("Enter the elements: ");
      for (int i = 0; i < N; i++) {
          for (int j = 0; j < N; j++) {
              A[i][j] = sc.nextInt();
          }
      }

      RowWithMaximumNumberOfOnes r = new RowWithMaximumNumberOfOnes();
      int ans = r.solve(A);
      System.out.println("The highest number of 1's is in index : " + ans);
    }
}
