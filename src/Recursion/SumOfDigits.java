package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public int solve(int A) {
        if (A == 0) { // Base case: If the number becomes 0, return 0
            return 0;
        }
        // Recursive case: Add the last digit to the sum of the rest of the digits
        return (A % 10) + solve(A / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A: ");
        int A = sc.nextInt();
        SumOfDigits obj = new SumOfDigits();
        System.out.println("Sum of digits: " + obj.solve(A));
    }
}
