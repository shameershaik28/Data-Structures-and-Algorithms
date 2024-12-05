package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class CheckPairSum {
    public int solve(int A, int[] B) {
        int N= B.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<N;i++)
        {
            int target= A-B[i];
            if(set.contains(target))
            {
               return 1;
            }
            else {
                set.add(B[i]);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target Value A: ");
        int A = sc.nextInt();
        System.out.println("Enter the size of the array: ");
        int N = sc.nextInt();
        int[] B = new int[N];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < N; i++)
        {
            B[i] = sc.nextInt();
        }
        CheckPairSum cps = new CheckPairSum();
        int ans = cps.solve(A, B);
        System.out.println(ans);
    }
}
