package TwoPointers;

import java.util.Scanner;

public class RainWaterTrapped {
    public int trap(final int[] A) {
        // Initialize pointers for the left and right ends of the array
        int leftIndex = 0, rightIndex = A.length - 1;

        // Variables to keep track of the maximum heights seen so far from the left and right
        int leftMax = 0, rightMax = 0;

        // Variable to store the total trapped water
        int result = 0;

        // Loop until the two pointers meet
        while (leftIndex <= rightIndex) {
            // If the left side's maximum height is less than or equal to the right side's
            if (leftMax <= rightMax) {
                // Calculate the water trapped at the current left index
                result += Math.max(leftMax - A[leftIndex], 0);

                // Update the left maximum height to include the current height
                leftMax = Math.max(leftMax, A[leftIndex]);

                // Move the left pointer to the right
                leftIndex += 1;
            } else {
                // Calculate the water trapped at the current right index
                result += Math.max(rightMax - A[rightIndex], 0);

                // Update the right maximum height to include the current height
                rightMax = Math.max(rightMax, A[rightIndex]);

                // Move the right pointer to the left
                rightIndex -= 1;
            }
        }

        // Return the total amount of trapped water
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<N;i++){
           A[i] = sc.nextInt();
       }
        RainWaterTrapped rt = new RainWaterTrapped();
        System.out.println(rt.trap(A));
    }

}
