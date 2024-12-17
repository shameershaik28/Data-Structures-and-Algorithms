package BinarySearch;

import java.util.Scanner;

public class SortedInsertPosition {
    public int searchInsert(int[] A, int B) {
        int n = A.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A[mid] == B) {
                return mid; // Target found
            }
            if (A[mid] < B) {
                low = mid + 1; // Search right
            } else {
                high = mid - 1; // Search left
            }
        }
        return low; // Index where target can be placed
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = in.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        System.out.println("Enter the target Value");
        int B = in.nextInt();
        SortedInsertPosition si = new SortedInsertPosition();
        System.out.println(si.searchInsert(A, B));
    }
}
