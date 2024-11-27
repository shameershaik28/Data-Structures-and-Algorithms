package BitManipulations;

import java.util.Scanner;

public class SetBit {
    public int solve(int A, int B) {
        int n =0; //take O bits

        n= (n|1<<A); // set Ath bit
        n= (n|1<<B);  // set Bth bit
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ath Bit");
        int A = sc.nextInt();
        System.out.println("Enter Bth Bit");
        int B = sc.nextInt();

        SetBit s = new SetBit();
        System.out.println("Decimal Number System: "+s.solve(A, B));
    }
}
