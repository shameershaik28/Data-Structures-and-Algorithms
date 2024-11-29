package Recursion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Print1ToAFunction {
    public void solve(int A) {
        //Base case
        if(A==1)
        {
            System.out.print(A+" ");
            return; //It goes back to the function when it has been called.
        }
        solve(A-1); //It calls the recursive function
        System.out.print(A+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A: ");
        int A = sc.nextInt();
        Print1ToAFunction p = new Print1ToAFunction();
        p.solve(A);
    }
}
