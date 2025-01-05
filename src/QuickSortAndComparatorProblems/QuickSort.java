package QuickSortAndComparatorProblems;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public int partition(int[] arr, int s, int e) {
        int i = s; // Pointer to track the boundary of elements less than the pivot.
        int j = s; // Pointer to iterate through the array.
        int pivot = arr[e]; // Choose the last element as the pivot.

        // Iterate through the array to partition elements based on the pivot.
        while (j < e) { // Adjusted condition to stop at e - 1
            if (arr[j] < pivot) { // If the current element is less than the pivot:
                // Swap arr[i] and arr[j] to move the smaller element to the left.
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; // Increment the boundary pointer.
            }
            j++; // Move to the next element.
        }

        // Swap the pivot element with the element at the boundary index.
        // This places the pivot in its correct sorted position.
        int temp = arr[i];
        arr[i] = arr[e];
        arr[e] = temp;

        return i; // Return the index of the pivot in the partitioned array.
    }

    public void quickSort(int[] arr, int s, int e) {
        if (s >= e) { // Fixed the base case condition
            return; // Base case: when the segment has 0 or 1 element
        }
        int p = partition(arr, s, e); // Partition the array and get the pivot index
        quickSort(arr, s, p - 1); // Recursively sort the left part
        quickSort(arr, p + 1, e); // Recursively sort the right part
    }

    public int[] solve(int[] A) {
        quickSort(A, 0, A.length - 1); // Sort the entire array
        return A;
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

        QuickSort qs = new QuickSort();
        int[] ans = qs.solve(A);
        System.out.println("Sorted Array: " + Arrays.toString(ans));
    }
}
