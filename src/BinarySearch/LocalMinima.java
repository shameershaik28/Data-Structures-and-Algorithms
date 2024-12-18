package BinarySearch;

import java.util.Scanner;

public class LocalMinima {
    public int solve(int[] A) {
        int N = A.length;
        int low = 0;
        int high = N - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is a local minima
            if ((mid == 0 || A[mid - 1] > A[mid]) && (mid == N - 1 || A[mid] < A[mid + 1])) {
                return A[mid];
            }
            // Move right if the left neighbor is smaller
            else if (mid == 0 || A[mid] < A[mid - 1]) {
                low = mid + 1;
            }
            // Move left if the right neighbor is smaller
            else {
                high = mid - 1;
            }
        }

        return -1; // This is a fallback, though a local minima is guaranteed for valid input
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        LocalMinima localMinima = new LocalMinima();
        System.out.println(localMinima.solve(A));
    }
}
