package Arrays.Matrices;

import java.util.Scanner;

public class RowWithMaximumNumberOfOnes {
    public int solve(int[][] A) {
        int N = A.length;
       int i =0, j =N-1, ans =0;

       while(i<N && j>=0){
           while(j>=0 && A[i][j]==1){
               j--;
               ans=i;
           }
           i++;
       }
        return ans;
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
      System.out.println(ans);
    }
}
