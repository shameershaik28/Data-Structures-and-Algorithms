package ProblemSolving;

import java.util.Scanner;

public class CountOfPrimes {
    public int solve(int A) {

        if (A <= 1) {
            return 0;
        }

        // Initialize the boolean array
        boolean[] isPrime = new boolean[A + 1];

        // Mark all numbers as prime initially
        for (int i = 2; i <= A; i++) {
            isPrime[i] = true;
        }

        // Implement the Sieve of Eratosthenes
        for (int i = 2; i * i <= A; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= A; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count the total number of primes
        int totalCount = 0;
        for (int i = 2; i <= A; i++) {
            if (isPrime[i]) {
                totalCount++;
            }
        }

        return totalCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();


        CountOfPrimes ob = new CountOfPrimes();
        int P = ob.solve(n);
        System.out.println("Number of primes up to " + n + ": " + P);
    }
}
