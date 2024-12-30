package Maths;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllPrimes {
    public int[] solve(int A) {

        if (A <= 2) {
            return new int[0]; // No prime numbers less than 2
        }

        // Step 1: Create a boolean array to track prime numbers
        boolean[] isPrime = new boolean[A];
        for (int i = 2; i < A; i++) {
            isPrime[i] = true;
        }

        // Step 2: Sieve of Eratosthenes
        for (int i = 2; i * i < A; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < A; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 3: Collect all prime numbers
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i < A; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        // Step 4: Convert ArrayList to int[] and return
        int[] result = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++) {
            result[i] = primes.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        // Scanner to take input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upper limit (A) to find primes: ");
        int N = sc.nextInt();

        // Create an instance of FindAllPrimes and find primes up to N.
        FindAllPrimes fp = new FindAllPrimes();
        int[] ans = fp.solve(N);

        // Print the list of prime numbers.
        System.out.println("Prime numbers up to " + N + ":");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
