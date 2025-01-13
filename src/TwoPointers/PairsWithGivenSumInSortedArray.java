package TwoPointers;

import java.util.Scanner;

public class PairsWithGivenSumInSortedArray {
    public int solve(int[] A, int B) {
        int MOD = 1000000007;
        int N = A.length;
        int l = 0;
        int r = N - 1;
        long count = 0;

        while (l < r) {
            int sum = A[l] + A[r];
            if (sum == B) {
                if (A[l] == A[r]) {
                    // All elements between l and r are the same
                    int numElements = r - l + 1;
                    count += (long) numElements * (numElements - 1) / 2;
                    count %= MOD;
                    break;
                } else {
                    int c1 = 1, c2 = 1;

                    // Count duplicates on the left
                    while (l + 1 < r && A[l] == A[l + 1]) {
                        c1++;
                        l++;
                    }

                    // Count duplicates on the right
                    while (r - 1 > l && A[r] == A[r - 1]) {
                        c2++;
                        r--;
                    }

                    count += (long) c1 * c2;
                    count %= MOD;
                    l++;
                    r--;
                }
            } else if (sum > B) {
                r--;
            } else {
                l++;
            }
        }
        return (int) count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int N = scanner.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Enter the sum B: ");
        int B = scanner.nextInt();

        PairsWithGivenSumInSortedArray pairs = new PairsWithGivenSumInSortedArray();
        System.out.println(pairs.solve(A, B));
    }
}
