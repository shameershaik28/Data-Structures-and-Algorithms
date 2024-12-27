package Maths;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllPrimes {
    public int[] solve(int A) {
        // Boolean array to track whether each number is prime.
        // `isPrime[i]` is true if `i` is prime, false otherwise.
        boolean[] isPrime = new boolean[A + 1];
        // List to store all prime numbers.
        ArrayList<Integer> primes = new ArrayList<>();

        // Initialize the isPrime array. Assume all numbers are prime initially.
        for (int i = 0; i <= A; i++) {
            isPrime[i] = true;
        }
        // Mark 0 and 1 as non-prime, as they are not prime numbers.
        isPrime[0] = isPrime[1] = false;

        // Sieve of Eratosthenes algorithm
        for (int i = 2; i <= A; i++) {
            // If the current number is prime, process its multiples.
            if (isPrime[i]) {
                // Add the current prime number to the list.
                primes.add(i);
                // Mark all multiples of `i` as non-prime.
                for (int j = 2 * i; j <= A; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Convert the ArrayList of primes into an array.
        int[] ans = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++) {
            ans[i] = primes.get(i);
        }
        return ans;
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
