package Maths;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public int gcd(int A, int B) {
        int divsior = A;
        int divident = B;

        int rem = divident % divsior;

        while(rem!=0)
        {
            divident = divsior;
            divsior = rem;
            rem = divident % divsior;
        }
        return divsior;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A Divisor: ");
         int A = sc.nextInt();
         System.out.println("Enter the B Dividend: ");
         int B = sc.nextInt();

         GreatestCommonDivisor gcd = new GreatestCommonDivisor();
         System.out.println(gcd.gcd(A, B));
    }
}
