package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfOddIndices {
    public int[] solve(int[] A, int[][] B) {
        int N = A.length;
        int Q = B.length;

        int[] ans = new int[Q];
        int[] pf= new int[N];

        pf[0]=0;

        for(int i=1; i<N; i++){
            if(i%2!=0)
            {
                pf[i]= pf[i-1]+A[i];
            }
            else
            {
                pf[i]=pf[i-1];
            }
        }

        for(int i =0; i<Q; i++)
        {
            int s= B[i][0];
            int e = B[i][1];

            if(s==0)
            {
                ans[i]= pf[e];
            }
            else {
                ans[i]= pf[e]-pf[s-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size of the array: ");
        int N = sc.nextInt();
        System.out.println("Enter the Number M: ");
        int M = sc.nextInt();

        int[] A = new int[N];
        System.out.println("Enter the elements of the A array: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the B elements : ");
        int[][] B = new int[M][2];
        for (int i = 0; i < M; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }
        SumOfOddIndices s = new SumOfOddIndices();
        System.out.println(Arrays.toString(s.solve(A, B)));

    }
}
