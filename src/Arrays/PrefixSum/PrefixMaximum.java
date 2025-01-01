package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixMaximum {
    public int[] solve(int[] A) {
        int N = A.length;
        int max = A[0];

        int[] prefixSum = new int[N];
        prefixSum[0] = A[0];
        for(int i=1; i<N;i++)
        {
            if(A[i]>max)
            {
                prefixSum[i] = A[i];
                max = A[i];
            }
            else
            {
                prefixSum[i] = prefixSum[i-1];
            }

        }
        return prefixSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        PrefixMaximum p = new PrefixMaximum();
        int[] ans = p.solve(arr);
        System.out.println(Arrays.toString(ans));
    }
}
