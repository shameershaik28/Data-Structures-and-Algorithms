package BitManipulations;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Test cases: ");
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println("Enter the decimal number: ");
            int decimal = sc.nextInt();
            System.out.println(Integer.toBinaryString(decimal));
        }
    }
}
