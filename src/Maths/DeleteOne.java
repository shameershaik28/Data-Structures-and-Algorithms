package Maths;

import java.util.Scanner;

public class DeleteOne {
    public int solve(int[] A) {
        // Calculate the total sum of the array
        int totalSum = 0;
        for (int i = 0; i < A.length; i++) {
            totalSum += A[i];
        }

        int maxSum = Integer.MIN_VALUE;
        // Loop through the array and calculate sum after removing each element
        for (int i = 0; i < A.length; i++) {
            int sumAfterDeletion = totalSum - A[i];
            maxSum = Math.max(maxSum, sumAfterDeletion);
        }

        return maxSum;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the size of array");
         int N = sc.nextInt();
         int[] A= new int[N];
         System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

         DeleteOne d = new DeleteOne();
         System.out.println(d.solve(A));
    }
}
