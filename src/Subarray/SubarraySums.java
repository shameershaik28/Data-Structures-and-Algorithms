package Subarray;

import java.util.Scanner;

public class SubarraySums
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");
        int N = sc.nextInt();

        if (N <= 0 || N > 1000) {
            System.out.println("Invalid input. Please enter a size between 1 and 1000.");
            return;
        }

        int[] A = new int[N];
System.out.println("Enter the elements of array");
        for(int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }

        int[] pf = new int[N];
        pf[0] = A[0];
        for(int i = 1; i < N; i++)
        {
            pf[i] = pf[i-1] + A[i];
        }


        for(int s = 0; s< N; s++)
        {
            for(int e = s; e < N; e++)
            {
                // Correct sum calculation using prefix sums
               int sum = (s == 0) ? pf[e] : pf[e] - pf[s - 1];
                System.out.print(sum + " ");
            }

        }
    }
}
