package Recursion;

import java.util.Scanner;

public class FindFibonacci {
    public int findAthFibonacci(int A) {

        if(A == 0 || A == 1)
        {
            return A;
        }
        return findAthFibonacci(A-1) + findAthFibonacci(A-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int A = sc.nextInt();
        FindFibonacci fib = new FindFibonacci();
        System.out.println(fib.findAthFibonacci(A));

    }
}
