package QuickSortAndComparatorProblems;

import java.util.Scanner;

public class sort01 {
    public int[] sort01(int[] A) {
        int N = A.length;
        int i = 0;
        int j = 0;

        while (j < N) {
            if (A[j] == 0) {
                // Swap A[i] and A[j]
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
            }
            j++; // Increment j once outside the if block
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        sort01 a = new sort01();
        int[] ans = a.sort01(A);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
