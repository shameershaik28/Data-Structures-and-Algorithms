package Recursion;

import java.util.Scanner;

public class MaxOfAnArrayUsingRecursion {
    private int maxArray(int[] A, int index, int N) {
        if (index == N-1) {
            return A[N-1];
        }
        int a = A[index];
        int b = maxArray(A, index+1, N);
        return Math.max(a, b);
    }
    public int getMax(int[] A) {
        return maxArray(A, 0, A.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        MaxOfAnArrayUsingRecursion obj = new MaxOfAnArrayUsingRecursion();
        System.out.println(obj.getMax(A));


    }
}
