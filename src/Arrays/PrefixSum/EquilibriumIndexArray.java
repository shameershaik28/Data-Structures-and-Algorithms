package Arrays.PrefixSum;

import java.util.Scanner;

public class EquilibriumIndexArray {
    public int solve(int[] A) {
        //Edge case
        if (A.length == 0) {
            return -1; // Edge case: Empty array, no equilibrium index
        }
        int totalSum = 0;

        // Calculate total sum using a traditional loop
        for (int i = 0; i < A.length; i++) {
            totalSum += A[i];
        }

        int leftSum = 0;

        // Iterate through the array to find the equilibrium index
        for (int i = 0; i < A.length; i++) {
            int rightSum = totalSum - leftSum - A[i];
            if (leftSum == rightSum) {
                return i; // Equilibrium index found
            }
            leftSum += A[i];
        }

        return -1; // No equilibrium index found
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
