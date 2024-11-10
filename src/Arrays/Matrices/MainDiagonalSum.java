package Arrays.Matrices;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class MainDiagonalSum {
    public int solve(final int[][] A) {
        int N = A.length;
        int sum =0;
        int j=0;
        for(int i = 0; i < N; i++) {
                if(i==j)
                {
                    sum +=A[i][j];
                }
                j++;
            }
           return sum;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns ");
        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        System.out.println("Enter the elements of 2D Matrix  ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        MainDiagonalSum m = new MainDiagonalSum();
        int ans = m.solve(arr);
        System.out.println(ans);
    }
}
