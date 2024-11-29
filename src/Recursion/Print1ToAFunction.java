package Recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Print1ToAFunction {
    public void recursive(int A) {
        // Base case
        if (A == 1) {
            System.out.print(A + " ");
            return; // Goes back to the function when it has been called.
        }
        recursive(A - 1); // Calls the recursive function
        System.out.print(A + " ");
    }

    public void solve(int A) {
        recursive(A); // Calls the recursive function
        System.out.println(); // After printing Everything It prints a new Line at the end.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A: ");
        int A = sc.nextInt();
        Print1ToAFunction p = new Print1ToAFunction();
        p.solve(A);
    }
}
