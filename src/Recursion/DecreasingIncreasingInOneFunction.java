package Recursion;

import java.util.Scanner;

public class DecreasingIncreasingInOneFunction {
    public void DecThenInc(int A)
    {
        PrintIncDec(A);
        System.out.println();
    }
    public void PrintIncDec(int A) {
        if (A == 0) {
            return;
        }

        // Print the decreasing part
        System.out.print(A + " ");

        // Recursive call for decreasing part
        PrintIncDec(A - 1);

        // Print the increasing part
        System.out.print(A + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int A = sc.nextInt();
        DecreasingIncreasingInOneFunction obj = new DecreasingIncreasingInOneFunction();
        obj.DecThenInc(A);
    }
}
