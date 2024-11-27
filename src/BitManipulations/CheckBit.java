package BitManipulations;

import java.util.Scanner;

public class CheckBit {
    public int solve(int A, int B) {

        if((A&(1<<B))==0) //If it is Unset
        {
            return 0;
        }
        else { // If it is set
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Bit");
        int A = sc.nextInt();
        System.out.println("Enter B Bit");
        int B = sc.nextInt();
        CheckBit cb = new CheckBit();
        System.out.println(cb.solve(A, B));
    }
}
