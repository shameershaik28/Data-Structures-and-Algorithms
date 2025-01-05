package CountSortAndMergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
    public int[] solve(int[] A) {
        int N = A.length;

        // Find the max and min values in the array
        int max = A[0];
        int min = A[0];
        for (int i = 1; i < N; i++) {
            max = Math.max(A[i], max);
            min = Math.min(A[i], min);
        }

        // Shift values to make them non-negative
        int shift = -min;
        int range = max - min + 1; // The range of values after shifting

        // Create frequency array of size equal to the range
        int[] frequency = new int[range];
        for (int i = 0; i < N; i++) {
            frequency[A[i] + shift]++;
        }

        // Iterate on the frequency array to create the sorted output
        int[] ans = new int[N];
        int K = 0;
        for (int i = 0; i < range; i++) {
            int freq = frequency[i];
            for (int j = 0; j < freq; j++) {
                ans[K] = i - shift; // Shift back to original values
                K++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        CountSort cs = new CountSort();
        int[] ans = cs.solve(A);
        System.out.println(Arrays.toString(ans));
    }
}