package BinarySearch;

import java.util.Scanner;

public class AthMagicalNumber {
    int mod = 1000000007;
    public int solve(int A, int B, int C) {
        long low = 0;
        long high = (long)A * Math.min(B, C);
        long lcm =(long) B * C / gcd(B, C);

        long ans = 0;

        while (low <= high) {
            long m = low + (high - low) / 2;
            long count = (m / B) + (m / C) - (m / lcm);
            if (count == A) {
                ans = m;
                high = m - 1;
            } else if (count < A) {
                low = m + 1;
            } else {
                high = m - 1;
            }
        }
        return (int) (ans%mod);
    }

    // Function to calculate GCD (Greatest Common Divisor)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for A, B, and C:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        AthMagicalNumber obj = new AthMagicalNumber();
        int ans = obj.solve(A, B, C);
        System.out.println("The Ath magical number is: " + ans);
    }
}
