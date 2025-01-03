package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatingElement {
    public int solve(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        int firstDuplicate = -1;

        // Traverse the array from right to left to ensure first occurrence is captured
        for (int i = A.length - 1; i >= 0; i--) {
            if (set.contains(A[i])) {
                firstDuplicate = A[i]; // Update the duplicate found
            } else {
                set.add(A[i]); // Add number to the set
            }
        }

        return firstDuplicate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        FirstRepeatingElement f = new FirstRepeatingElement();
        int ans = f.solve(arr);
        System.out.println(ans);
    }
}
