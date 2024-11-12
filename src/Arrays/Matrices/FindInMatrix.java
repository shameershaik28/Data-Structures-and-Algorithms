package Arrays.Matrices;

import java.util.Scanner;

public class FindInMatrix {
    public int solve(int[][] A, int B) {
        int N = A.length;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(A[i][j]==B)
                {
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] A = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int B = sc.nextInt();

        FindInMatrix obj = new FindInMatrix();
        int ans = obj.solve(A, B);
        System.out.println(ans);
    }
}
