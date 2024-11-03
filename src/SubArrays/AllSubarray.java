package SubArrays;

import java.util.Scanner;

public class AllSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();

        int[] A = new int[N];
System.out.println("Enter the elements of the array");
        for(int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }
System.out.println("The all the subarrays of the given array");
        for(int s =0; s<N ;s++)
        {
            for(int e =s; e<N; e++)
            {
                for(int k =s; k<=e; k++)
                {
                    System.out.print(A[k]+" ");
                }
                System.out.println();
            }
        }

    }
}
