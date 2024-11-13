package Arrays.Matrices;

import java.util.Scanner;

public class AreMatricesSame {
    public int solve(int[][] A, int[][] B) {
        int N = A.length;
        int M = A[0].length;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(A[i][j] != B[i][j]) {
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns ");
        int M = sc.nextInt();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        System.out.println("Enter the elements of A");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of B");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        AreMatricesSame a = new AreMatricesSame();
        int ans = a.solve(A, B);
        System.out.println(ans);
    }
}
