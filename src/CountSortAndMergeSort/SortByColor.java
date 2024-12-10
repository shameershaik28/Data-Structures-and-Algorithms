package CountSortAndMergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class SortByColor {
    public int[] sortColors(int[] A) {
        // Step 1: Create a frequency array to count occurrences of 0s, 1s, and 2s
        int[] freq = new int[3];

        // Count the occurrences of each number in the input array
        for (int i = 0; i < A.length; i++) {
            freq[A[i]]++;  // Increment the frequency of A[i]
        }

        // Step 2: Overwrite the input array with sorted values based on frequencies
        int idx = 0;  // Index for updating the input array
        for (int i = 0; i < freq.length; i++) {
            // Fill the array with the current number `i` based on its frequency
            while (freq[i] > 0) {
                A[idx] = i;  // Assign the current number
                idx++;       // Move to the next index
                freq[i]--;   // Decrement the frequency of the current number
            }
        }

        // Return the sorted array
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        SortByColor s = new SortByColor();
        int[] ans = s.sortColors(A);
        System.out.println(Arrays.toString(ans));
    }

}
