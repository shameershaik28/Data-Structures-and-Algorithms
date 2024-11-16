package Heaps;

import java.util.PriorityQueue;
import java.util.Scanner;

public class kthLargestElement {
    public static int solve(int[] A, int K) {
        int N = A.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>(K);

        for (int i = 0; i < K; i++) {
            pq.add(A[i]);
        }

        for (int i = K; i < N; i++) {
            if (A[i] > pq.peek()) {
                pq.poll();
                pq.add(A[i]);
            }
        }
        return pq.peek();
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
