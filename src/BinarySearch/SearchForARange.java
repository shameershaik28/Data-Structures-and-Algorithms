package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchForARange {
    // Function to find the first and last occurrence of the target
    public int[] searchRange(final int[] A, int B) {
        int[] res = new int[2];
        res[0] = findFirstOccurrence(A, B); // Find first occurrence
        res[1] = findLastOccurrence(A, B);  // Find last occurrence
        return res;
    }

    // Function to find the first occurrence of the target
    public int findFirstOccurrence(int[] A, int K) {
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

    public int findLastOccurrence(int[] A, int K) {
        int N = A.length;
        int low = 0;
        int high = N - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] == K) {
                ans = mid; // Update answer
                low = mid + 1; // Search in the right half
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

        System.out.println("Enter the size of the array:");
        int N = sc.nextInt();
        int[] A = new int[N];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter the target value:");
        int B = sc.nextInt();

        SearchForARange sr = new SearchForARange();
        int[] result = sr.searchRange(A, B);
        System.out.println(Arrays.toString(result));
    }
}
