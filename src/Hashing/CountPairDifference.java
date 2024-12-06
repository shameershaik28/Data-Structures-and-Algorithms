package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class CountPairDifference {
    public int solve(int[] A, int B) {
        int N = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < N; i++) {
            // Check for pairs satisfying |A[i] - A[j]| = B
            if (map.containsKey(A[i] - B)) {
                count += map.get(A[i] - B);
            }
            if (map.containsKey(A[i] + B)) {
                count += map.get(A[i] + B);
            }
            // Update frequency map
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the Target B: ");
        int B = sc.nextInt();

        CountPairDifference cp = new CountPairDifference();
        System.out.println("Number of pairs with difference " + B + ": " + cp.solve(A, B));
    }
}
