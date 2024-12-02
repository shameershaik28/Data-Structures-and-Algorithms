package Recursion;

import java.util.Scanner;

public class IsMagic {
    public int solve(int A) {
        // Call the solving function and check if the result is 1
        return solving(A) == 1 ? 1 : 0;
    }

    // Recursive helper function to reduce A to a single digit
    public int solving(int A) {
        // Base case: If A is already a single digit, return A
        if (A >= 0 && A <= 9) {
            return A;
        }

        // Compute the sum of the digits of A
        // A % 10 gives the last digit, solving(A / 10) processes the remaining digits
        int sumOfDigits = A % 10 + solving(A / 10);

        // Recursively call solving to handle the new sum until it becomes a single digit
        return solving(sumOfDigits);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A :");
        int A = sc.nextInt();
        IsMagic obj = new IsMagic();
        int result = obj.solve(A);
        System.out.println(result); // Expected output: 0
    }
}
