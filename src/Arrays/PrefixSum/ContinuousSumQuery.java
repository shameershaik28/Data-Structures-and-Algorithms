package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class ContinuousSumQuery {
    public int[] solve(int A, int[][] B) {
        int n = B.length;
        int[] ans = new int[A];

        for(int i = 0; i < n; i++) {
            int L = B[i][0]-1;
            int R = B[i][1]-1;
            int P = B[i][2];

            ans[L] = ans[L] + P;

            if(R+1<A)
            {
                ans[R+1] = ans[R+1] - P;
            }
        }
        for(int i = 1; i < A; i++)
        {
            ans[i]= ans[i]+ans[i-1];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = in.nextInt();
        System.out.println("Enter the Number of Devotees: ");
        int A = in.nextInt();

        int[][] B= new int[N][N];
        System.out.println("Enter the elements of the array in 2D array: ");

        for (int i = 0; i < N; i++) {
            B[i][0] = in.nextInt();
            B[i][1] = in.nextInt();
            B[i][2] = in.nextInt();
        }

        ContinuousSumQuery q = new ContinuousSumQuery();
        int[] ans = q.solve(A, B);
        System.out.println(Arrays.toString(ans));


    }
}
