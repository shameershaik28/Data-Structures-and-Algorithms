package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class DistinctNumbersInWindow {
    public int[] dNums(int[] A, int B) {
        int N = A.length;

        // Define the resultant array size (N - B + 1).
        int[] ans = new int[N - B + 1];

        int index = 0;
        // Create a frequency map for the first window of size B.
        HashMap<Integer, Integer> map = new HashMap<>();

        // Sliding Window
        for (int i = 0; i < B; i++) {
            int ele = A[i];
            // If the element is already in the map, increase its frequency.
            if (map.containsKey(ele)) {
                int val = map.get(ele);
                map.put(ele, val + 1);
            } else {
                // Otherwise, add the element to the map with frequency 1.
                map.put(ele, 1);
            }
        }

        // The size of the map is the number of distinct elements in the first window.
        ans[index] = map.size();
        index++;

        // Initialize two pointers: s (start) and e (end) for the sliding window.
        int s = 1;
        int e = B;

        // Use the sliding window method to iterate over the entire array.
        while (e < N) {

           if(map.containsKey(A[e]))
           {
               int val = map.get(A[e]);
               map.put(A[e], val +1);
           }
           else
           {
               map.put(A[e], 1);
           }


           int old = map.get(A[s-1]);
           map.put(A[s-1], old - 1);

           if(map.get(A[s-1]) == 0)
           {
               map.remove(A[s-1]);
           }
            ans[index] = map.size();
           index++;

            // Move the window one step to the right.
            s++;
            e++;
        }

        // Return the array containing the count of distinct elements in each window.
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter B Size: ");
        int B = sc.nextInt();

        DistinctNumbersInWindow dn = new DistinctNumbersInWindow();
        int[] res = dn.dNums(A, B);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
