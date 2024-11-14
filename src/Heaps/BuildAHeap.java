package Heaps;

import java.util.Arrays;
import java.util.Scanner;

public class BuildAHeap {
    public int[] buildHeap(int[] A) {
        int N = A.length;
        int left, right, index, smallest;

        // Start heapifying from the last non-leaf node
        for (int i = N / 2 - 1; i >= 0; i--) {
            index = i;

            // While there is a need to adjust the subtree rooted at `index`
            while (index < N) {
                smallest = index;
                left = 2 * index + 1;
                right = 2 * index + 2;

                // Check if left child exists and is smaller than the current node
                if (left < N && A[left] < A[smallest]) {
                    smallest = left;
                }

                // Check if right child exists and is smaller than the current smallest
                if (right < N && A[right] < A[smallest]) {
                    smallest = right;
                }

                // If the smallest is not the current index, swap and continue heapifying
                if (smallest != index) {
                    int temp = A[index];
                    A[index] = A[smallest];
                    A[smallest] = temp;
                    index = smallest; // Move to the next level of the tree
                } else {
                    break; // If no swap, stop the heapify process
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the heap: ");
        int n = sc.nextInt();

        int[] A = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        BuildAHeap h = new BuildAHeap();
        int[] ans = h.buildHeap(A);
        System.out.println(Arrays.toString(ans));
    }
}
