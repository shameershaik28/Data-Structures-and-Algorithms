package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class CountDistinctElements {
    public int solve(int[] A) {
        int N = A.length;
        HashSet<Integer> ans  = new HashSet<>();

        for(int i = 0; i < N; i++)
        {
            ans.add(A[i]);
        }
        return ans.size();
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of array");
       int N = sc.nextInt();
       System.out.println("Enter the elements");
       int[] A = new int[N];
       for (int i = 0; i < N; i++) {
           A[i] = sc.nextInt();
       }

       CountDistinctElements obj = new CountDistinctElements();
       System.out.println(obj.solve(A));
    }
}
