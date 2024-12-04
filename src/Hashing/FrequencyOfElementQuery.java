package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfElementQuery {
    public int[] solve(int[] A, int[] B) {
        int N = A.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if(map.containsKey(A[i])) {
                int freq= map.get(A[i]);
                map.put(A[i], freq+1);
            }
            else {
                map.put(A[i], 1);
            }
        }

        //Traverse the B queries
        int[] result = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            if (map.containsKey(B[i])) {
                result[i] = map.get(B[i]); // Store frequency in the result array
            } else {
                result[i] = 0; // Store 0 if the element is not in A
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array A:");
        int N = sc.nextInt();
        System.out.println("Enter the size of array B:");
        int M = sc.nextInt();

        System.out.println("Enter elements of array A:");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter elements of array B:");
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        FrequencyOfElementQuery obj = new FrequencyOfElementQuery();
        int[] ans = obj.solve(A, B);

        System.out.println("Frequencies of elements in B:");
        System.out.println(Arrays.toString(ans));
    }
}
