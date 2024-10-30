package ProblemSolving;

import java.util.Scanner;

public class CountOfPrimes {
    public int factors(int A) {
        int primeCount = 0;
        for(int i =2; i<=A; i++) {
            int count=0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    if (j == i / j) {
                        count = count + 1;
                    } else {
                        count += 2;
                    }
                }
            }
            if(count == 2)
            {
                primeCount++;
            }
        }
        return primeCount;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();


        CountOfPrimes ob = new CountOfPrimes();
        int P = ob.factors(n);
        System.out.println("Number of primes up to " + n + ": " + P);
    }
}
