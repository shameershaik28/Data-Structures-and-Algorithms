package Arrays.Matrices;

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {
    public int[][] solve(int[][] A) {
        int N = A.length;

        //Transpose the matrix
        for(int i=0; i<N; i++)
        {
            for(int j=i+1; j<N; j++)
            {
                int temp = A[i][j];
                A[i][j]= A[j][i];
                A[j][i]= temp;
            }
        }

        //reverse the matrix
        for(int i=0; i<N; i++)
        {
            int s=0, e=N-1;
            while(s<e)
            {
                int temp= A[i][s];
                A[i][s]= A[i][e];
                A[i][e]= temp;
                s++;
                e--;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size N of array");
        int N = sc.nextInt();

        int[][] A = new int[N][N];

        System.out.println("Enter the elements of the 2D array");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        RotateMatrix obj = new RotateMatrix();
       int[][] ans =  obj.solve(A);
       System.out.println(Arrays.deepToString(ans));


    }
}
