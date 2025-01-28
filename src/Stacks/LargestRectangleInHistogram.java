package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] A) {
        int N = A.length;
        int[] left = new int[N];
        int[] right = new int[N];
        Stack<Integer> st = new Stack<>();

        // Calculate left limits
        for (int i = 0; i < N; i++) {
            while (!st.isEmpty() && A[st.peek()] >= A[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                left[i] = st.peek();
            } else {
                left[i] = -1;
            }
            st.push(i);  // Store index instead of value
        }

        st.clear();  // Clear the stack for the right limits

        // Calculate right limits
        for (int i = N - 1; i >= 0; i--) {
            while (!st.isEmpty() && A[st.peek()] >= A[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                right[i] = st.peek();
            } else {
                right[i] = N;
            }
            st.push(i);  // Store index instead of value
        }

        // Calculate the maximum area
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int p1 = left[i];
            int p2 = right[i];
            ans = Math.max(ans, A[i] * (p2 - p1 - 1));
        }

        return ans;  // Return the maximum area after the loop
    }

    // Main method
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        // Create an instance of the LargestRectangleInHistogram class
        LargestRectangleInHistogram lrih = new LargestRectangleInHistogram();

        // Read the size of the histogram
        System.out.print("Enter the number of bars in the histogram: ");
        int size = sc.nextInt();

        // Read the heights of the bars
        int[] heights = new int[size];
        System.out.println("Enter the heights of the bars: ");
        for (int i = 0; i < size; i++) {
            heights[i] = sc.nextInt();
        }

        // Call the largestRectangleArea method and get the result
        int maxArea = lrih.largestRectangleArea(heights);

        // Print the maximum area
        System.out.println("The largest rectangle area in the histogram is: " + maxArea);

        sc.close();
    }
}

