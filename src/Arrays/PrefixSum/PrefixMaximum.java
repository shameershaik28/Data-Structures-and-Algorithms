package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixMaximum {
    public int[] solve(int[] A) {
        int N = A.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<N;i++)
        {
            if(A[i]>max)
            {
                max = A[i];
            }
            if(A[i]<max)
            {
                A[i]=max;
            }
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        PrefixMaximum p = new PrefixMaximum();
        int[] ans = p.solve(arr);
        System.out.println(Arrays.toString(ans));
    }
}
