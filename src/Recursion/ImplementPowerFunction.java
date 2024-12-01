package Recursion;

import java.util.Scanner;

public class ImplementPowerFunction {
    public int pow(int A, int B, int C) {

        if(A == 0)
            return 0;
        if(B == 0)
            return 1;


        long ans = pow(A, B / 2, C);


        ans = (ans * ans) % C;

        // If B is odd, multiply by A once more: (ans * A) % C
        if(B % 2 == 1)
            ans = (ans * A) % C;

        // Ensure ans is non-negative by adding C and taking modulo C
        ans = (ans + C) % C;

        // Cast to int and return the result
        return (int)ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        ImplementPowerFunction obj = new ImplementPowerFunction();
        System.out.println(obj.pow(A, B, C));

    }
}
