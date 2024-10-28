package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseInARange {
    public int[] solve(int[] A, int B, int C) {


        int N = A.length;

       while(B<C)
       {
           int temp = A[B];
           A[B] = A[C];
           A[C] = temp;
           B++;
           C--;
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();
        System.out.println("Enter the number B");
        int B = sc.nextInt();
        System.out.println("Enter the number C");
        int C = sc.nextInt();

        // Validate B and C
        if (B < 0 || C < 0 || B > C || C >= N) {
            System.out.println("B and C must satisfy: 0 <= B <= C <= N - 1");
            return;
        }

        int[] A= new int[N];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }

        ReverseInARange r = new ReverseInARange();
        System.out.println(Arrays.toString(r.solve(A,B,C)));
    }
}
