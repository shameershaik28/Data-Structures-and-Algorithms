package PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNumbersInARange
{
    public int[] solve(int[] A, int[][] B) {
        int Q = B.length;
        int N = A.length;

        int[] ans = new int[Q];

        for(int i = 0; i < N; i++)
        {
            if(A[i] % 2 == 0)
            {
                A[i]=1;
            }
            else
            {
                A[i]=0;
            }
        }

        int[] pref =new int[N];
        pref[0]= A[0];

        for(int i = 1; i < N; i++)
        {
            pref[i] = pref[i-1] + A[i];
        }


        for (int i = 0; i < Q; i++) {
            int count = 0;
            // Get the start and end indices from B
            int start = B[i][0];
            int end = B[i][1];

            if (start == 0)
            {
                ans[i] = pref[end];
            }
            else {
                ans[i]= pref[end] - pref[start-1];
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
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
