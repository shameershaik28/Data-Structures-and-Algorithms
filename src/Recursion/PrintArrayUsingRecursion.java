package Recursion;

import java.util.Scanner;

public class PrintArrayUsingRecursion {
    public void PrintArray(int[] A) {
        PrintArrayHelper(A, 0); // Start recursion with index 0
        System.out.println();
    }

    private void PrintArrayHelper(int[] A, int index) {
        if (index == A.length) { // Base case: when index reaches array length
            return;
        }
        System.out.print(A[index] + " ");
        PrintArrayHelper(A, index + 1); // Recursive call with next index
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        PrintArrayUsingRecursion p = new PrintArrayUsingRecursion();
        p.PrintArray(arr);
    }
}
