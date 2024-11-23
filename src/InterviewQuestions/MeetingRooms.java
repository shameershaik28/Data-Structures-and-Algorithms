package InterviewQuestions;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MeetingRooms {
    public int solve(int A, int[][] B) {
        if (A == 0 || B == null || B.length == 0) {
            return 0; // No meetings, no rooms needed
        }

        // Step 1: Sort intervals by start time
      Arrays.sort(B, (a, b) -> a[0] - b[0]);

        // Step 2: Min-Heap to track end times of meetings
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Step 3: Process each interval
        for (int[] interval : B) {
            // If the room is free (current meeting starts after the earliest ending meeting)
            if (!minHeap.isEmpty() && interval[0] >= minHeap.peek()) {
                minHeap.poll(); // Remove the earliest ending meeting
            }
            // Add the current meeting's end time to the heap
            minHeap.add(interval[1]);
        }

        // Step 4: The size of the heap is the number of rooms needed
        return minHeap.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int[][] B = new int[A][2];
        for (int i = 0; i < A; i++) {
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }

        MeetingRooms m = new MeetingRooms();
        int ans = m.solve(A, B);
        System.out.println(ans);
    }
}
