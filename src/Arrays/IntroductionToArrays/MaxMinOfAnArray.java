package Arrays.IntroductionToArrays;

import java.util.Scanner;

public class MaxMinOfAnArray {
    public int solve(int[] A) {
        int N = A.length;

        if (N == 0) return 0;
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] > Max) {
                Max = A[i];
            }
            if (A[i] < Min) {
                Min = A[i];
            }
        }

        int sum = Max+Min;
        return sum;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = input.nextInt();

        int[] A = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }

        MaxMinOfAnArray m = new MaxMinOfAnArray();
        int ans = m.solve(A);
        System.out.println("The total sum is : "+ ans);
    }
}
