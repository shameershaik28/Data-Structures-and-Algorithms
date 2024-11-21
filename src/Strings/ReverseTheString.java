package Strings;

import java.util.Scanner;

public class ReverseTheString {
    public String solve(String A) {
        int N = A.length();
        String ans = "";

        int i = N - 1;
        while (i >= 0) {
            // Skip any spaces
            if (A.charAt(i) != ' ') {
                StringBuilder current = new StringBuilder();

                // Collect the word starting from the current index
                while (i >= 0 && A.charAt(i) != ' ') {
                    current.append(A.charAt(i));
                    i--;
                }

                // Reverse the current word
                current.reverse();

                // Add a space if necessary before the next word
                if (!ans.isEmpty()) {
                    ans += " ";
                }

                // Append the reversed word to the result
                ans += current.toString();
            }

            // Move the index back to skip any spaces between words
            i--;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();

        ReverseTheString r = new ReverseTheString();
        System.out.println(r.solve(s));
    }
}
