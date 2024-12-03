package Maths;

import java.util.Scanner;

public class PairSumDivisibleByM {
    public int solve(int[] A, int B) {
        int N = A.length;
        int[] frequency = new int[B];
        int count = 0;
        for(int i = 0; i < N; i++) {
            int val = A[i]%B;
            int pair = B-val;
            if(val==0)
            {
                pair=0;
            }
            count = count + frequency[pair];
            frequency[val]++;
        }
        return (count)%1000000007;

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
        System.out.println("Enter the B: ");
        int B = sc.nextInt();
        PairSumDivisibleByM ps = new PairSumDivisibleByM();
        System.out.println(ps.solve(A, B));
    }
}
