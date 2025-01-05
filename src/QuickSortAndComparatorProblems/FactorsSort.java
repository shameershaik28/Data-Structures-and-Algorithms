package QuickSortAndComparatorProblems;

import java.util.*;

public class FactorsSort {
    // Function to count the number of factors of a number
    public int factorCount(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) // Perfect square case
                    count++;
                else
                    count += 2; // Count both factors
            }
        }
        return count;
    }

    public int[] solve(int[] A) {
        // Convert int[] to Integer[] for custom sorting
        Integer[] arr = new Integer[A.length];
        for (int i = 0; i < A.length; i++) {
            arr[i] = A[i];
        }

        // Sort using a custom comparator
        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer val1, Integer val2) {
                int fact1 = factorCount(val1);
                int fact2 = factorCount(val2);

                if (fact1 < fact2) {
                    return -1; // Sort by ascending factor count
                } else if (fact1 > fact2) {
                    return 1;
                } else {
                    return val1 - val2; // Sort by natural order in case of ties
                }
            }
        });

        // Convert Integer[] back to int[]
        for (int i = 0; i < A.length; i++) {
            A[i] = arr[i];
        }

        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of elements
        System.out.print("Enter the number of elements: ");
        int N = sc.nextInt();

        int[] A = new int[N];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        FactorsSort fs = new FactorsSort();
        int[] result = fs.solve(A);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}