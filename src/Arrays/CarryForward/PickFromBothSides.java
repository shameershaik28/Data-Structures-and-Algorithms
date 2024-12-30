package Arrays.CarryForward;

import java.util.Scanner;

public class PickFromBothSides {
        public int solve(int[] A, int B) {
            int N = A.length;

            // Initial sum of the first B elements
            int currentSum = 0;
            for (int i = 0; i < B; i++) {
                currentSum += A[i];
            }

            int maxSum = currentSum;

            // Carry forward: Remove elements from the left and add from the right
            for (int i = 1; i <= B; i++) {
                currentSum = currentSum - A[B - i] + A[N - i];
                maxSum = Math.max(maxSum, currentSum);
            }

            return maxSum;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();

        int[] A = new int[N];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < N; i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the B element");
        int B = sc.nextInt();

        Arrays.PrefixSum.PickFromBothSides p = new Arrays.PrefixSum.PickFromBothSides();
        int ans = p.solve(A, B);
        System.out.println("The maximum possible sum : are "+ ans);

    }
}
