package Queues;

import java.util.ArrayList; // Import for using ArrayList
import java.util.ArrayDeque; // Import for using ArrayDeque
import java.util.Deque; // Import for using Deque
import java.util.List; // Import for using List

public class ParkingIceCreamTruck {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    /**
     * This method finds the maximum value in every contiguous subarray (or sliding window)
     * of size B in the given list A.
     *
     * @param A - The input list of integers.
     * @param B - The size of the sliding window.
     * @return An ArrayList containing the maximum values for each sliding window.
     */
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        Deque<Integer> d = new ArrayDeque<>(); // Deque to store indices of elements
        ArrayList<Integer> ans = new ArrayList<>(); // List to store maximums of each window

        // Process the first sliding window of size B
        for (int i = 0; i < B; i++) {
            // Maintain the deque such that it only contains indices of useful elements for the current window
            // Remove indices from the back of the deque while the corresponding values are less than the current element
            while (d.size() > 0 && A.get(i) > A.get(d.getLast())) {
                d.removeLast(); // Remove smaller elements from the back of the deque
            }
            d.addLast(i); // Add the current index to the deque
        }

        // Add the maximum for the first window to the result list
        ans.add(A.get(d.getFirst())); // The maximum is at the front of the deque

        // Start processing the rest of the list
        int s = 1;
        int e = B;
        while (e < A.size()) {
            // If the maximum element going out of the window is at the front of the deque, remove it
            if (d.getFirst() == s - 1) {
                d.removeFirst(); // Remove the index of the outgoing element
            }
            // Maintain the deque for the current element at index 'e'
            // Remove indices from the back of the deque while the corresponding values are less than the current element
            while (d.size() > 0 && A.get(e) > A.get(d.getLast())) {
                d.removeLast(); // Remove smaller elements from the back of the deque
            }
            d.addLast(e); // Add the current index to the deque

            // Add the maximum for the current window to the result list
            ans.add(A.get(d.getFirst())); // The maximum is at the front of the deque
            s++;
            e++; // Move to the next index
        }

        return ans; // Return the list of maximum values for each sliding window
    }

    public static void main(String[] args) {
        ParkingIceCreamTruck solution = new ParkingIceCreamTruck();

        // Sample input
        List<Integer> A = List.of(1, 3, -1, -3, 5, 3, 6, 7);
        int B = 3;

        // Call the slidingMaximum method and print the result
        ArrayList<Integer> result = solution.slidingMaximum(A, B);
        System.out.println(result);  // Expected output: [3, 3, 5, 5, 6, 7]
    }
}

