package Recursion;

import java.util.Scanner;

public class FastPower {
    public long power(int A, int B) {
        if(B==0)
        {
            return 1;
        }
        return power(A, B - 1) * A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A");
        int A = sc.nextInt();
        System.out.println("Enter the B power");
        int B = sc.nextInt();
        FastPower fp = new FastPower();
        System.out.println(fp.power(A, B));
    }
}
