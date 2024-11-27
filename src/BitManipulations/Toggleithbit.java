package BitManipulations;

import java.util.Scanner;

public class Toggleithbit {
    public int solve(int A, int B) {

        if((A&(1<<B))==0)
        {
            return A^(1<<B);
        }
        else {
            return A^(1<<B);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A :");
        int A = sc.nextInt();
        System.out.println("Enter B :");
        int B = sc.nextInt();

        Toggleithbit t = new Toggleithbit();
        System.out.println(t.solve(A, B));
    }
}
