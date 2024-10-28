package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheArray
{
    public int[] solve(int[] A) {
        int N = A.length;

        // Handle case for zero elements
        if (N == 0) {
            System.out.println("The array is empty.");
            return A; // Return the empty array
        }
        int s =0;
        int e =N-1;
        //it reverses the array
      int[] ans =new int[N];
        while(s<e)
        {
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
           s++;
           e--;
        }
        //After reversing, it adds in a new array
        for(int i=0; i<N; i++)
        {
            ans[i] = A[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();

        // Handle case for invalid size
        if (N < 0) {
            System.out.println("Invalid Input. Size of the array cannot be negative.");
            return;
        }
        int[] A = new int[N];
        if (N > 0) {
            System.out.println("Enter the elements of array");
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
        }

        ReverseTheArray r = new ReverseTheArray();
        System.out.println(Arrays.toString(r.solve(A)));
    }
}
