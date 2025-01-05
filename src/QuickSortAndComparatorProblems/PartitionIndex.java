package QuickSortAndComparatorProblems;

import java.util.Arrays;
import java.util.Scanner;

public class PartitionIndex {
    public int partition(int[] arr) {
        int N = arr.length; // Get the length of the array.
        int i = 0; // Pointer to track the boundary of elements less than the pivot.
        int j = 0; // Pointer to iterate through the array.
        int pivot = arr[N - 1]; // Choose the last element as the pivot.

        // Iterate through the array to partition elements based on the pivot.
        while (j < N) {
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
        int temp = arr[j - 1];
        arr[j - 1] = arr[i];
        arr[i] = temp;

        return i; // Return the index of the pivot in the partitioned array.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        PartitionIndex p = new PartitionIndex();
        System.out.println("partitionIndex is : "+p.partition(arr));
    }
}
