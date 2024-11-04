package PrefixSum;

import java.util.Scanner;

public class PickFromBothSides
{
    public int solve(int[] A, int B) {
        int N = A.length;

        int[] pf = new int[N];
        int[] sf = new int[N];

        pf[0]= A[0];
        for(int i=1;i<N;i++)
        {
            pf[i]= pf[i-1] + A[i];
        }
        sf[N-1]= A[N-1];
        for(int i=N-2;i>=0;i--)
        {
            sf[i]= sf[i+1] + A[i];
        }

        int ans = Math.max(pf[B-1], sf[N-B]);

        for (int i =1; i<B; i++)
        {
            int sum = pf[i-1]+sf[N-B+i];
            ans = Math.max(ans, sum);
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();

        int[] A = new int[N];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the B element");
        int B = sc.nextInt();

        PickFromBothSides p = new PickFromBothSides();
        int ans = p.solve(A, B);
        System.out.println("The maximum possible sum : are "+ ans);

    }
}
