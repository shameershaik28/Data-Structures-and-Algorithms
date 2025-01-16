package Arrays.SlidingWindowAndContributionTechnique;

import java.util.Scanner;

public class MinimumSwaps {
    public int solve(int[] A, int B) {
        int N = A.length;

        int countOfElementsLessThanB = 0;

        for (int i = 0; i < N; i++) {
            if (A[i] <= B) {
                countOfElementsLessThanB++;
            }
        }

        int badElements = 0;

        for (int i = 0; i < countOfElementsLessThanB; i++) {
            if (A[i] > B) {
                badElements++;
            }
        }

        int swaps = badElements;

        int start = 0;
        int end = countOfElementsLessThanB;

        while (end < N) {
            if (A[start] > B) {
                badElements--;
            }
            if (A[end] > B) {
                badElements++;
            }

            swaps = Math.min(swaps, badElements);
            start++;
            end++;
        }
        return swaps;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int B = sc.nextInt();

        MinimumSwaps solution = new MinimumSwaps();
        int ans = solution.solve(A, B);
        System.out.println(ans);
    }
}
