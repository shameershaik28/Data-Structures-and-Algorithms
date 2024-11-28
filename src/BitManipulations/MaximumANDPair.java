package BitManipulations;

import java.util.Scanner;

public class MaximumANDPair {
    public int solve(int[] A) {
        int result = 0;

        // Check each bit position from most significant (31) to least significant (0)
        for (int bit = 31; bit >= 0; bit--) {
            int count = 0;
            int temp = result | (1 << bit); // Set the current bit in the temporary result

            // Count how many numbers satisfy the condition with the temporary result
            for (int i = 0; i < A.length; i++) {
                if ((A[i] & temp) == temp) {
                    count++;
                }
            }

            // If at least 2 numbers satisfy, update the result
            if (count >= 2) {
                result = temp;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        MaximumANDPair m = new MaximumANDPair();
        System.out.println("maximum A[i] & A[j] : "+m.solve(A));
    }
}
