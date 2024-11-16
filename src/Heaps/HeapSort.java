package Heaps;

import java.util.Scanner;

public class HeapSort {

    // Iterative HeapSort function
    public void sort(int[] arr) {
        int n = arr.length;

        // Build a max heap (from bottom to top)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapifyIterative(arr, n, i);
        }

        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call heapify on the reduced heap
            heapifyIterative(arr, i, 0);
        }
    }

    // Iterative heapify function to maintain the heap property
    void heapifyIterative(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        while (true) {
            int largestTemp = largest;

            // If left child is larger than root
            if (left < n && arr[left] > arr[largestTemp]) {
                largestTemp = left;
            }

            // If right child is larger than root or left child
            if (right < n && arr[right] > arr[largestTemp]) {
                largestTemp = right;
            }

            // If the largest is not root
            if (largestTemp != largest) {
                // Swap the elements
                int temp = arr[largest];
                arr[largest] = arr[largestTemp];
                arr[largestTemp] = temp;

                // Update largest and check the next level of the heap
                largest = largestTemp;
                left = 2 * largest + 1;
                right = 2 * largest + 2;
            } else {
                break;  // Exit the loop if no swaps are needed
            }
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the HeapSort
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Unsorted array:");
        printArray(arr);

        // Create an instance of HeapSort and sort the array
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
