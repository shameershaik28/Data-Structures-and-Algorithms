package PrefixSum;

import java.util.Scanner;

public class EquilibriumIndexArray{
    public int solve(int[] A) {
        int N = A.length;
        if (N == 0) return -1; // Handle empty array case
        int[] pf = new int[N];

        pf[0]= A[0];
        for(int i=1;i<N;i++)
        {
            pf[i] = pf[i-1]+A[i];
        }


        for(int i =0; i<N ; i++)
        {
            int leftSum = (i > 0) ? pf[i - 1] : 0; // Simplified initialization of leftSum
            int rightSum = pf[N-1]-pf[i];
            if(leftSum==rightSum)
            {
                return i ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int N = sc.nextInt();

        int[] A = new int[N];
System.out.println("Enter the elements in the array");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
     EquilibriumIndexArray eq = new EquilibriumIndexArray();
        int result = eq.solve(A);

        // Output the result
        if (result != -1) {
            System.out.println("Equilibrium index: " + result);
        } else {
            System.out.println("No equilibrium index found :"  + result);
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
