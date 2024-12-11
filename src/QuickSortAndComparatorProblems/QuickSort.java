package QuickSortAndComparatorProblems;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public int partition(int[] arr, int s, int e) {
        int pivot = arr[e]; // Select the last element as the pivot
        int j = s; // Start partitioning from the 's' index
        for (int i = s; i < e; i++) {
            if (arr[i] < pivot) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        // Swap the pivot element to its correct position
        int temp = arr[e];
        arr[e] = arr[j];
        arr[j] = temp;
        return j; // Return the partition index
    }

    public void quickSort(int[] arr, int s, int e) {
        if (s >= e) {
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
