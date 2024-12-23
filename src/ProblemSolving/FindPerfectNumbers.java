package ProblemSolving;

import java.util.Scanner;

public class FindPerfectNumbers {
    public int solve(int A) {
        //Base Condition
        if(A<=1) return 0;
        int sum = 1; // Start sum with 1, which is a divisor of every number

        for (int i = 2; i * i <= A; i++) {
            if (A % i == 0) {
                sum += i; // Add the divisor i
                if (i != A / i) {
                    sum += A / i; // Add the complementary divisor (only if different from i)
                }
            }
        }
        // Return 1 if sum of divisors equals A (Perfect Number), else return 0
        return sum == A ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N = sc.nextInt();
        FindPerfectNumbers f = new FindPerfectNumbers();
        System.out.println(f.solve(N));
        sc.close(); // Close the scanner
    }
}
