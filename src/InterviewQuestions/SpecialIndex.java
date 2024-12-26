package InterviewQuestions;

import java.util.Scanner;

public class SpecialIndex {
    public int countSpecialIndices(int[] arr) {
        int n = arr.length;

        // Step 1: Calculate total sums of even and odd indices
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }

        // Step 2: Initialize variables for left sums
        int leftEvenSum = 0, leftOddSum = 0;
        int count = 0;

        // Step 3: Iterate through the array
        for (int i = 0; i < n; i++) {
            // Remove the current element and adjust sums
            int rightEvenSum = evenSum - leftEvenSum - (i % 2 == 0 ? arr[i] : 0);
            int rightOddSum = oddSum - leftOddSum - (i % 2 != 0 ? arr[i] : 0);

            // Check if sums are equal
            if (leftEvenSum + rightOddSum == leftOddSum + rightEvenSum) {
                count++;
            }

            // Update left sums
            if (i % 2 == 0) {
                leftEvenSum += arr[i];
            } else {
                leftOddSum += arr[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        SpecialIndex si = new SpecialIndex();
        System.out.println("Number of special indices: " + si.countSpecialIndices(arr));
    }
}

