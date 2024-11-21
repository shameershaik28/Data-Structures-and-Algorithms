package Strings;

import java.util.Scanner;

public class  SimpleReverse {
        public String solve(String A) {
            StringBuilder sb = new StringBuilder(A);
            int s = 0;
            int e = sb.length() - 1;

            while (s < e) {
                // Swap characters in-place
                char temp = sb.charAt(s);
                sb.setCharAt(s, sb.charAt(e));
                sb.setCharAt(e, temp);

                s++;
                e--;
            }

            return sb.toString(); // Return the reversed string
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        SimpleReverse l = new SimpleReverse();
        System.out.println(l.solve(s));
    }
}