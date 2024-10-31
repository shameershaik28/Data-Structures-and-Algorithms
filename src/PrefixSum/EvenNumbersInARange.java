package PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNumbersInARange
{
    public long[] solve(int[] A, int[][] B) {
        int Q = B.length;

        long[] ans = new long[Q];


        for (int i = 0; i < Q; i++) {
            int count = 0;
            // Get the start and end indices from B
            int start = B[i][0];
            int end = B[i][1];



            for (int j = start; j <= end; j++) {
                if (A[j] % 2 == 0) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Enter the range M: ");
        int Q = sc.nextInt();

        int[] A = new int[N];
        System.out.println("Enter the elements of A: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[][] B = new int[Q][2];
        System.out.println("Enter the elements of B: ");
        for(int i = 0; i < Q; i++){
            B[i][0]= sc.nextInt();
            B[i][1] = sc.nextInt();
        }

        EvenNumbersInARange r = new EvenNumbersInARange();
        System.out.println(Arrays.toString(r.solve(A, B)));

        sc.close();
    }
}
