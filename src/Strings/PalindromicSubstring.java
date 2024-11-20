package Strings;

import java.util.Scanner;

public class PalindromicSubstring {
    public boolean isPalindrome(String A, int s, int e) {
        while (s < e) {
            if (A.charAt(s) != A.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        // Input start and end indices
        System.out.println("Enter the start index:");
        int start = sc.nextInt();
        System.out.println("Enter the end index:");
        int end = sc.nextInt();

        // Create instance and call method
        PalindromicSubstring lps = new PalindromicSubstring();
        System.out.println("Is the substring a palindrome?");
        System.out.println(lps.isPalindrome(s, start, end));
    }
}
