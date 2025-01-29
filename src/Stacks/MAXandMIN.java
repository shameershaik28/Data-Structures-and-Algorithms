package Stacks;

import java.util.Stack;
import java.util.Scanner;

public class MAXandMIN {

    // Finds the index of the Next Greater Element on the Left
    public int[] getNextGreaterLeftIndices(int[] arr) {
        int length = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return result;
    }

    // Finds the index of the Next Greater Element on the Right
    public int[] getNextGreaterRightIndices(int[] arr) {
        int length = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? length : stack.peek();
            stack.push(i);
        }
        return result;
    }

    // Finds the index of the Next Smaller Element on the Left
    public int[] getNextSmallerLeftIndices(int[] arr) {
        int length = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return result;
    }

    // Finds the index of the Next Smaller Element on the Right
    public int[] getNextSmallerRightIndices(int[] arr) {
        int length = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? length : stack.peek();
            stack.push(i);
        }
        return result;
    }

    // Solves the given problem using Next Greater and Next Smaller indices
    public int solve(int[] arr) {
        long totalSum = 0L;
        long mod = 1000000007;
        int length = arr.length;

        int[] greaterLeft = getNextGreaterLeftIndices(arr);
        int[] greaterRight = getNextGreaterRightIndices(arr);
        int[] smallerLeft = getNextSmallerLeftIndices(arr);
        int[] smallerRight = getNextSmallerRightIndices(arr);

        for (int i = 0; i < length; i++) {
            // Contribution when arr[i] is the maximum
            long maxContribution = (long) arr[i] * (i - greaterLeft[i]) * (greaterRight[i] - i);

            // Contribution when arr[i] is the minimum
            long minContribution = (long) arr[i] * (i - smallerLeft[i]) * (smallerRight[i] - i);

            // Calculate final sum using modulo to prevent overflow
            totalSum = (totalSum + maxContribution - minContribution + mod) % mod;
        }
        return (int) totalSum;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of the MAXandMIN class
        MAXandMIN maxMin = new MAXandMIN();

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Read the elements of the array
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the solve method and get the result
        int result = maxMin.solve(arr);

        // Print the result
        System.out.println("The result is: " + result);

        sc.close();
    }
}

