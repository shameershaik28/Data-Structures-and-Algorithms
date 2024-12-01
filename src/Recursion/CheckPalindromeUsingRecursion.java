package Recursion;

import java.util.Scanner;

public class CheckPalindromeUsingRecursion {
    public int Check(String A, int i, int j) {
        // Base case: if the pointers have crossed or are at the same position
        if (i >= j) {
            return 1;  // Palindrome
        }

        // If characters at the current positions are not equal
        if (A.charAt(i) != A.charAt(j)) {
            return 0;  // Not a palindrome
        }

        // Move the pointers inward and continue the recursion
        return Check(A, i + 1, j - 1);
    }

    public int solve(String A) {
        return Check(A, 0, A.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String A = sc.nextLine();
        CheckPalindromeUsingRecursion c = new CheckPalindromeUsingRecursion();
        System.out.println(c.solve(A));
    }
}
