package Recursion;

import java.util.Scanner;

public class PrintATo1Function {
    public void printATo1(int A) {
        if (A == 1) {
            System.out.print(A + " ");
            return;
        }
        System.out.print(A + " ");
        printATo1(A - 1);
    }

    public void solve(int A) {
        printATo1(A); // Calls the recursive method to print numbers
        System.out.println(); // Adds a newline after printing
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A :");
        int A = sc.nextInt();
        PrintATo1Function p = new PrintATo1Function();
        p.solve(A);
    }
}
