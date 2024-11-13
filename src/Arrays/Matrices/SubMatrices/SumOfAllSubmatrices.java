package Arrays.Matrices.SubMatrices;

import java.util.Scanner;

public class SumOfAllSubmatrices {
    public int solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;

        int ans =0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int topLeft= (i+1)*(j+1);
                int bottomRight= (N-i)*(M-j);
                int occ = topLeft*bottomRight;
               ans = ans +A[i][j]*occ;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the matrix ");
       int N = sc.nextInt();
       int[][] A = new int[N][N];
       System.out.println("Enter the elements of the matrix ");
       for (int i = 0; i < N; i++) {
           for (int j = 0; j < N; j++) {
               A[i][j] = sc.nextInt();
           }
       }

       SumOfAllSubmatrices s = new SumOfAllSubmatrices();
       int ans = s.solve(A);
       System.out.println(ans);
    }
}
