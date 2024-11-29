package Recursion;

import java.util.Scanner;

public class FindFactorial {
    public int solve(int A) {
        if(A == 1)
        {
            return 1;
        }
        return solve(A - 1) * A;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        FindFactorial f = new FindFactorial();
        System.out.println(f.solve(n));

    }
}
