package Arrays.PrefixSum;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum {
    public int[] solve(int[] A) {
        int N = A.length;

        for(int i =1; i<N ; i++)
        {
            A[i] = A[i-1]+A[i];
        }
        return A;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int N = sc.nextInt();

        int[] A = new int[N];
System.out.println("Enter the elements in the array: ");
        for(int i = 0; i < N; i++)
        {
            A[i]= sc.nextInt();
        }

        PrefixSum ps = new PrefixSum();
        System.out.println(Arrays.toString(ps.solve(A)));
    }
}
