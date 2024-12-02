package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class AllIndicesOfArray {
    // Recursive helper function
    private int[] findIndices(int[] A, int B, int index, int count) {
        if (index == A.length) {
            // Base case: Create the result array of size 'count' and return
            return new int[count];
        }

        // Recursive call
        int[] result;
        if (A[index] == B) {
            result = findIndices(A, B, index + 1, count + 1); // Increment count if match
            result[count] = index; // Store index in the result array
        } else {
            result = findIndices(A, B, index + 1, count); // No increment if no match
        }

        return result;
    }

    // Main function to be called by the user
    public int[] allIndices(int[] A, int B) {
        return findIndices(A, B, 0, 0); // Start from index 0 and count 0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element: ");
        int B = sc.nextInt();

        AllIndicesOfArray obj = new AllIndicesOfArray();
        int[] res = obj.allIndices(arr, B);
        System.out.println(Arrays.toString(res));
    }
}
