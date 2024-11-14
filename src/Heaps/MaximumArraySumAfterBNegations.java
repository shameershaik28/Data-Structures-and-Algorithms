package Heaps;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumArraySumAfterBNegations {

    public int solve(int[] A, int B) {
        int N = A.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add all elements to the priority queue (min-heap)
        for (int i = 0; i < N; i++) {
            pq.add(A[i]);
        }

        // Perform B negations
        for (int i = 0; i < B; i++) {
            // Negate the smallest element (top of the min-heap)
            int smallest = pq.poll();
            pq.add(-smallest); // Add the negated element back to the heap
        }

        // Calculate the sum of the array after the B negations
        int sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the B Operations");
        int B = sc.nextInt();

        MaximumArraySumAfterBNegations obj = new MaximumArraySumAfterBNegations();
        int ans = obj.solve(A, B);
        System.out.println(ans);
    }
}
