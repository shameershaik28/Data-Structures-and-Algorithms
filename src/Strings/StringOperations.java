package Strings;

import java.util.Scanner;

public class StringOperations {
    public String solve(String A) {
        // Step 1: Concatenate the string with itself.
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        sb.append(A);  // A concatenated with itself

        // Step 2: Remove all uppercase letters from the concatenated string
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
                sb.deleteCharAt(i);
                i--; // Adjust index after deletion to check the next character
            }
        }

        // Step 3: Replace vowels with '#'
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.setCharAt(i, '#');
            }
        }

        // Return the resultant string
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  // Read input string
        StringOperations so = new StringOperations();
        System.out.println(so.solve(s));  // Call solve and print the result
        sc.close();  // Close the scanner resource
    }
}
