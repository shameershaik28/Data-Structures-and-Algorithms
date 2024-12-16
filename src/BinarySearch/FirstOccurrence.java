package BinarySearch;

import java.util.Scanner;

public class FirstOccurrence {
    public int solve(int[] A, int K) {
        int N = A.length;
        int low = 0;
        int high = N - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] == K) {
                ans = mid; // Update answer
                high = mid - 1; // Search in the left half
            } else if (A[mid] < K) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        return ans; // Return -1 if not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.println("Enter the size of array:");
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        // Input array elements
        int[] arr = new int[N];
        System.out.println("Enter the elements of array (sorted):");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target value
        System.out.println("Enter the Target Value:");
        int K = sc.nextInt();

        // Solve
        FirstOccurrence f = new FirstOccurrence();
        int ans = f.solve(arr, K);

        // Output result
        if (ans == -1) {
            System.out.println("Target value not found in the array.");
        } else {
            System.out.println("First occurrence of target value is at index: " + ans);
        }

        sc.close();
    }
}
