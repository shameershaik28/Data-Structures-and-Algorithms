package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class SuffixMaximum {
    public int[] solve(int[] A) {
        int n = A.length;
        int maxSum= A[n-1];
        int[] suff = new int[n];
        suff[n-1] = maxSum;

        for(int i =n-2; i>=0;i--)
        {
            if(A[i]>maxSum)
            {
                maxSum = A[i];
            }
            suff[i] = maxSum;
        }
        return suff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        SuffixMaximum sm = new SuffixMaximum();
        int[] result = sm.solve(A);
        System.out.println(Arrays.toString(result));
    }
}
