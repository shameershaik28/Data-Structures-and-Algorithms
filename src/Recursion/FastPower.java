package Recursion;

import java.util.Scanner;

public class FastPower {
    public long power(int A, int B) {
        if(B==0)
        {
            return 1;
        }
        long p = power(A, B/2);
        if(B%2==0)
        {
            return p*p;
        }
        else {
            return p*p*A;
        }
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
