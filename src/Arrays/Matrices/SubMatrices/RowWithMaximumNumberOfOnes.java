package Arrays.Matrices.SubMatrices;

import java.util.Scanner;

public class RowWithMaximumNumberOfOnes {
    public int solve(int[][] A) {
        int N = A.length;
        int max = Integer.MIN_VALUE;
        int index=-1;

        for(int i = 0; i < N; i++) {
            int sum =0;
            for(int j = 0; j < N; j++) {
                if(A[i][j] == 1) {
                    sum++;
                }
            }

            if(sum > max) {
                max = sum;
                index = i;
            }
        }
        return index;
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
