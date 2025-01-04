package CountSortAndMergeSort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestNumber {
    public int[] smallestNumber(int[] A) {
        int N = A.length;
        int[] freq = new int[10];  // Frequency array for digits 0-9

        // Step 1: Count the frequency of each digit
        for (int i = 0; i < N; i++) {
            freq[A[i]]++;
        }

        // Step 2: Reconstruct the smallest number in-place
        int k = 0;  // Pointer to track position in the input array
        for (int digit = 0; digit < 10; digit++) {
            for (int i = 0; i < freq[digit]; i++) {
                A[k++] = digit;  // Place the digit in the input array
            }
        }

        return A;  // Return the modified array
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

        SmallestNumber s = new SmallestNumber();
        int[] ans = s.smallestNumber(A);
        System.out.println(Arrays.toString(ans));

    }
}
