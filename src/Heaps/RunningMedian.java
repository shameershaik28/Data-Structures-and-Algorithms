package Heaps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RunningMedian {

    /**
     * Idea:
     * We don’t need to maintain a fully sorted array at each step.
     * Instead, we only need to correctly place the middle element (for odd length)


     or the middle pair (for even length) using two heaps.
     *
     * Approach:
     * - Use a max heap to store the smaller half of the numbers.
     * - Use a min heap to store the larger half of the numbers.
     * - Ensure that the heaps are balanced in size, with the max heap allowed to have

     *   one extra element for odd cases.
     *
     * Steps:
     * 1. Insert the first element into the max heap.
     * 2. For each new element, decide which heap to insert it into based on
     *    its value relative to the max heap’s root.
     * 3. Balance the heaps if necessary.
     * 4. Calculate the median based on the sizes of the heaps.
     */

        public int[] solve(int[] A) {

            int[] result = new int[A.length];

            // Max heap to store the smaller half of the numbers
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
            // Min heap to store the larger half of the numbers
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            // Insert the first element into the max heap
            maxHeap.add(A[0]);
            result[0] = A[0];
            for(int i=1;i<A.length;i++){
                // Insert into appropriate heap
                if (!maxHeap.isEmpty() && A[i] < maxHeap.peek()) {
                    maxHeap.add(A[i]);
                } else {
                    minHeap.add(A[i]);
                }

                // Balance the heaps if necessary
                if (Math.abs(maxHeap.size() - minHeap.size()) > 1) {
                    if (maxHeap.size() > minHeap.size()) {
                        minHeap.add(maxHeap.poll());
                    } else {
                        maxHeap.add(minHeap.poll());
                    }
                }
                // Calculate the median
                if(!minHeap.isEmpty() && !maxHeap.isEmpty()) {
                    if (i % 2 == 0) {
                        result[i] = maxHeap.size() > minHeap.size() ? maxHeap.peek() : minHeap.peek();
                    } else result[i] = maxHeap.element();
                }
            }
            return result;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        RunningMedian rm = new RunningMedian();
        int[] ans = rm.solve(A);
        System.out.println("Running median: " + Arrays.toString(ans));
    }
}
