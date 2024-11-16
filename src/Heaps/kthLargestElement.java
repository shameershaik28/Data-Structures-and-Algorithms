package Heaps;

import java.util.Scanner;

public class kthLargestElement {
    // Approach 2: Using Max-Heap (HeapSort Implementation)
    // Convert the array into a max heap using heapify.
    // Extract the maximum element K times to get the Kth largest element.
    public static int solve(int[] A, int K) {
        int N = A.length;

        // Build max heap (Convert array into a max heap)
        for (int i = N / 2 - 1; i >= 0; i--) {
            heapifyIterative(A, N, i);
        }

        // Extract the max element K times
        for (int i = N - 1; i >= N - K; i--) {
            // Swap the root (maximum element) with the last element in the heap
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;

            // Heapify the reduced heap
            heapifyIterative(A, i, 0);
        }

        // The Kth largest element is at the root after K extractions
        return A[N - K];
    }

    // Iterative Heapify function to maintain max heap property
    private static void heapifyIterative(int[] arr, int n, int i) {
        int largest = i;
        while (true) {
            // Left and Right child indices
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            // Find the largest among root, left child, and right child
            if (left < n && arr[left] > arr[largest]) {
                largest = left;
            }
            if (right < n && arr[right] > arr[largest]) {
                largest = right;
            }

            // If the largest is still the root, the heap property is satisfied
            if (largest == i) {
                break;
            }

            // Swap the root with the largest child
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Move down to the largest child
            i = largest;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the size of the array
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();
        int[] arr = new int[N];

        // Reading the elements of the array
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Reading the K value (the Kth largest element to find)
        System.out.println("Enter the K value");
        int K = sc.nextInt();

        // Call the solve method to find the Kth largest element
        int ans = solve(arr, K);

        // Print the result
        System.out.println("Kth largest element (by heap): " + ans);
    }
}
