package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
    public int kthsmallest(final int[] A, int B) {
        // Sort the array
        Arrays.sort(A);
        // Return the (B-1)th index, since array indices are 0-based
        return A[B - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();
        int[] A = new int[N];

        // Input elements of the array
        System.out.println("Enter the elements: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Input B (1-based index of the k-th smallest element)
        int B = sc.nextInt();

        // Create an instance of KthSmallestElement and find the answer
        KthSmallestElement k = new KthSmallestElement();
        int ans = k.kthsmallest(A, B);

        // Print the answer
        System.out.println(ans);

        sc.close(); // Close the scanner
    }
}
