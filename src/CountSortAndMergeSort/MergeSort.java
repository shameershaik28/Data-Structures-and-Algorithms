package CountSortAndMergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public int[] MergeTwoSortedArray(int[] left, int[] right) {
        int N = left.length;
        int M = right.length;

        int i = 0, j = 0, k = 0;
        int[] result = new int[N + M];

        while (i < N && j < M) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < N) {
            result[k++] = left[i++];
        }
        while (j < M) {
            result[k++] = right[j++];
        }
        return result;
    }

    public int[] solve(int[] A) {
        int lo = 0;
        int hi = A.length - 1;
        return mergeSort(A, lo, hi);
    }

    public int[] mergeSort(int[] A, int lo, int hi) {
        if (lo == hi) {
            return new int[]{A[lo]};
        }

        int mid = (lo + hi) / 2;
        int[] left = mergeSort(A, lo, mid);
        int[] right = mergeSort(A, mid + 1, hi);

        return MergeTwoSortedArray(left, right);
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

        MergeSort ms = new MergeSort();
        int[] res = ms.solve(A);
        System.out.println("Sorted Array: " + Arrays.toString(res));
    }
}
