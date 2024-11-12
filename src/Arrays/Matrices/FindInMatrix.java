package Arrays.Matrices;

import java.util.Scanner;

public class FindInMatrix {
    public int solve(int[][] A, int B) {
        int N = A.length;


        int i =0, j =N-1;

        while(i<N && j>=0)
        {
            if(A[i][j]==B)
            {
                return 1;
            }
            else if(A[i][j] <B)
            {
                i++;
            }
            else {
                j--;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int N = sc.nextInt();

        int[][] A = new int[N][N];
System.out.println("Enter the elements of the matrix");
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
