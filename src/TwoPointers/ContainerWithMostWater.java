package TwoPointers;

import java.util.Scanner;

public class ContainerWithMostWater {
    public int maxArea(int[] A) {
        if (A == null || A.length < 2) {
            return 0; // Handle invalid or insufficient input
        }

        int N = A.length;
        int left = 0;
        int right = N - 1;
        int ans = 0;

        while (left < right) {
            int water = (right - left) * Math.min(A[left], A[right]);
            ans = Math.max(ans, water);

            if (A[left] > A[right]) {
                right--;
            } else {
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a positive integer for the size of the array: ");
            int N = in.nextInt();

            if (N <= 0) {
                System.out.println("Array size must be greater than 0.");
                return;
            }

            int[] A = new int[N];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            ContainerWithMostWater cw = new ContainerWithMostWater();
            System.out.println("Maximum water that can be contained: " + cw.maxArea(A));
        }
    }
}
