package BitManipulations;

import java.util.Scanner;

public class NumberOf1Bits {
    public int numSetBits(int A) {
        int count = 0;

        for(int i =0; i<32; i++){
            if((A & (1<<i))>0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int A = sc.nextInt();
        NumberOf1Bits ob = new NumberOf1Bits();
        System.out.println("Number of 1 bits are : "+ob.numSetBits(A));
    }
}
