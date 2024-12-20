package BinarySearch;

import java.util.Scanner;

public class PaintersPartitionProblem {
    public int paint(int A, int B, int[] C) {
        long low = 0;
        long high = 0;

        // Calculate low (max element) and high (sum of elements)
        for (int i = 0; i < C.length; i++) {
            high += (long) C[i];
            low = Math.max(low, (long) C[i]);
        }

        long ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (isPossible(C, mid, A)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Multiply the result by B and return modulo 10000003
        return (int) ((ans * B) % 10000003);
    }

    public boolean isPossible(int[] C, long maxTime, int A) {
        int painters = 1;
        long currTime = 0;

        for (int i = 0; i < C.length; i++) {
            if (currTime + C[i] > maxTime) {
                painters++;
                currTime = C[i];
                if (painters > A) {
                    return false;
                }
            } else {
                currTime += C[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the board Array: ");
        int N = in.nextInt();
        int[] C = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            C[i] = in.nextInt();
        }
        System.out.println("How many painters: ");
        int A = in.nextInt();
        System.out.println("Required Time :");
        int B = in.nextInt();
        PaintersPartitionProblem p = new PaintersPartitionProblem();
        int ans = p.paint(A, B, C);
        System.out.println(ans);
    }
}
