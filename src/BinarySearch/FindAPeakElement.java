package BinarySearch;

import java.util.Scanner;

public class FindAPeakElement {
    public int solve(int[] a) {
        // Get the length of the array
        int n = a.length;

        // Initialize low and high pointers for binary search
        int low = 0;
        int high = n - 1;

        // Start the binary search loop
        while (low <= high) {
            // Calculate the middle index
            int mid = low + ((high - low) / 2);

            // Check if mid is a peak element:
            // - mid == 0 or a[mid] >= a[mid - 1] (it is greater than or equal to its left neighbor)
            // - mid == n - 1 or a[mid] >= a[mid + 1] (it is greater than or equal to its right neighbor)
            if ((mid == 0 || a[mid] >= a[mid - 1]) && (mid == n - 1 || a[mid] >= a[mid + 1])) {
                return a[mid];  // Return the peak element if found
            }
            // If the element at mid is smaller than its left neighbor, the peak is on the left side
            else if (a[mid] < a[mid - 1]) {
                high = mid - 1;  // Move the high pointer to the left half
            }
            // If the element at mid is smaller than its right neighbor, the peak is on the right side
            else {
                low = mid + 1;  // Move the low pointer to the right half
            }
        }

        return -1;  // Return -1 if no peak element is found (though this should never happen in a valid input)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        FindAPeakElement obj = new FindAPeakElement();
        System.out.println(obj.solve(A));

    }
}
